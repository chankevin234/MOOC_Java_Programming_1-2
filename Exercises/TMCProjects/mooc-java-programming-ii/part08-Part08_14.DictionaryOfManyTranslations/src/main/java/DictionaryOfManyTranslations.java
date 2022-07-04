import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        // adds the translation for the word and preserves the old translations.
        if (word != null && translation != null) {
            this.dictionary.putIfAbsent(word, new ArrayList<>());
            ArrayList<String> translationArrayList = this.dictionary.get(word);
            translationArrayList.add(translation);
        }
    }

    public ArrayList<String> translate(String word) {
//        for (String translation : this.dictionary.get(word)) {
//            System.out.println(translation);
//        }
        ArrayList<String> emptyList = new ArrayList<>();

        return this.dictionary.getOrDefault(word, emptyList);
    }

    public void remove(String word) {

        this.dictionary.remove(word);
    }

}
