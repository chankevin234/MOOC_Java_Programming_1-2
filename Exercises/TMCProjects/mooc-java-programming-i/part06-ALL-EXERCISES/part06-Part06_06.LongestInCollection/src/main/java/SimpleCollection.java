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

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        String longestString = this.elements.get(0); //set reference object
        for (String element : elements) {
            if (element.length() > longestString.length()) {
                //if the length of the current element is longer than the longestString, it becomes the new longest string object
                longestString = element; //string object
            }
        }
        return longestString;
    }
}
