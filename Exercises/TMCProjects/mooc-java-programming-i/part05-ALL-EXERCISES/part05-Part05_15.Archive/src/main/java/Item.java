public class Item {
    private String identifier;
    private String name;

    public Item(String itemId, String itemName) {
        this.identifier = itemId;
        this.name = itemName;
    }

    public boolean equals(Object compared) {
        //checks if the compared item is exact position of existing item
        if (this == compared) {
            return true;
        }
        //check if the compared item is even of type "Item"
        if (!(compared instanceof Item)) {
            return false;
        }

        //convert generic Object compared into a Item type
        Item comparedItem = (Item) compared;

        //check if an item of same name exists
        if (this.identifier.equals(comparedItem.identifier)) {
            return true;
        }

        return false;
    }


    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
