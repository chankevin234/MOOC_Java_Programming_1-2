import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/*
    This Class is used to keep track of storage units and their contents
 */

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageFacility;

    public StorageFacility() {
        this.storageFacility = new HashMap<>();
    }

    public void add(String unit, String item) {
        // adds the parameter item to the storage unit that is also given as a parameter.

        this.storageFacility.putIfAbsent(unit, new ArrayList<>());
        this.storageFacility.get(unit).add(item); // gets the value at the key then adds the arraylist there
    }

    public ArrayList<String> contents(String storageUnit) {
        // returns a list that contains all the items in the storage unit indicated by the parameter.
        // If there is no such storage unit or it contains no items, the method should return an empty list.
        return this.storageFacility.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        // removes the given item from the given storage unit.
        // Only removes one item
        this.storageFacility.get(storageUnit).remove(item);
        // If the storage unit would be empty after the removal, the method also removes the unit.
        if (this.storageFacility.get(storageUnit).isEmpty()) {
            this.storageFacility.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        //returns the names of the storage units as a list. NB! Only the units that contain items are listed.
        ArrayList<String> storageUnitsWithItems = new ArrayList<>();

        for (String storageUnitKey : this.storageFacility.keySet()) {
            if (!this.storageFacility.get(storageUnitKey).isEmpty()) {
                storageUnitsWithItems.add(storageUnitKey);
            }
        }
        return storageUnitsWithItems;
    }
}