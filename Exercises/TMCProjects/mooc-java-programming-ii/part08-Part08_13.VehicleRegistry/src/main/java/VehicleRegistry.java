import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> vehicleRegistry;

    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        // assigns the owner it received as a parameter to a car that corresponds to the license plate received as a parameter.

        // If the license already has an owner attached, the method returns false and does nothing.
        for (LicensePlate plate : vehicleRegistry.keySet()) {
            if (plate.equals(licensePlate)) {
                //if a plate, of the same string value exists already, you can't add it again
                return false;
            }
        }
        // If the license plate doesn't have an owner, the method returns true and adds the licencePlate and owner to the registry as 1 car
        this.vehicleRegistry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        //returns the owner of the car corresponding to the license plate received as a parameter.
        // If the car isn't in the registry, the method returns null.
        if (this.vehicleRegistry.get(licensePlate) == null) {
            return null;
        }
        return this.vehicleRegistry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        // removes the license plate and attached data from the registry.
        // The method returns true if removed successfully
        if(this.vehicleRegistry.get(licensePlate) == null) {
            return false;
        }

        this.vehicleRegistry.remove(licensePlate);
        return true;
        // false if the license plate wasn't in the registry.
    }

    public void printLicensePlates() {
        //prints the all the license plates in the registry.
        for (LicensePlate plate : this.vehicleRegistry.keySet()) {
            System.out.println(plate); //toString to print out the value of the license plate
        }
    }
    public void printOwners() {
        // you can create a list used for remembering the owners that were already printed.
        // If an owner is not on the list, their name is printed and they are added to the list
        //List of printed owners:
        ArrayList<String> ownerList = new ArrayList<>();

        //prints the owners of the cars in the registry. Each name should only be printed once, even if a particular person owns more than one car.
        for (String plate : this.vehicleRegistry.values()) {
            String ownerName = plate;
            if (!ownerList.contains(ownerName)) {
                ownerList.add(ownerName);
            }
        }
        for (String owner : ownerList) {
            System.out.println(owner);
        }
    }

}
