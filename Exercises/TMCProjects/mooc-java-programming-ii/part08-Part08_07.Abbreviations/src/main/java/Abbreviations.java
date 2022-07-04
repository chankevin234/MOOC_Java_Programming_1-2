import java.util.HashMap;
import java.util.Locale;

public class Abbreviations {
    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(sanitizedString(abbreviation), explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbreviations.containsKey(abbreviation)) {
            return true;
        }
        else {
            return false;
        }
    }

    public String findExplanationFor(String abbreviation) {
        if (hasAbbreviation(abbreviation) == true) {
            return this.abbreviations.get(abbreviation);
        }
        else {
            return null;
        }
    }

    public static String sanitizedString(String abbreviation) {
        if (abbreviation == null) {
            return "";
        }

        abbreviation = abbreviation.toLowerCase();
        return abbreviation.trim();
    }

}
