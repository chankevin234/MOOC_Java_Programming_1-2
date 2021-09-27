import java.util.HashMap;

public class SimpleDictionary {

    private HashMap<String, String> translations; //initializes hashmap dict

    public SimpleDictionary() {
        this.translations = new HashMap<>(); //instantiates hashmap
    }

    public String translate(String word) {
        return this.translations.get(word); // return the translation of a work based on key pair 'word'
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation); //adds a new key pair to hashmap
    }

    public String toString() {
        return "SimpleDictionary{" +
                "translations=" + translations +
                '}';
    }
}
