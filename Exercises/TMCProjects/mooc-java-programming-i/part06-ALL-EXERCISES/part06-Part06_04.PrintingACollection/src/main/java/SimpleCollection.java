import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String message = "The collection " + this.name + " has ";
        String itemsInCollection = "";
        int elementsNum = elements.size();

        for (String items : elements) {
            if (elementsNum == 1) {
                itemsInCollection = itemsInCollection + items;
            } else {
                itemsInCollection = itemsInCollection + items + "\n";
            }
        }

        if (elementsNum == 0) {
            return "The collection " + this.name + " is empty.";
        } else if (elementsNum == 1) {
            return message + "1 element:\n" + itemsInCollection;
        } else {
            return message + elementsNum + " elements:\n" + itemsInCollection;
        }
    }
}
