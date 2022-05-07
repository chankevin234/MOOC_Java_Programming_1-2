
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nicknamesHash = new HashMap<>();
        nicknamesHash.put("matthew", "matt");
        nicknamesHash.put("michael", "mix");
        nicknamesHash.put("arthur", "artie");

        System.out.print(nicknamesHash.get("matthew"));
    }

}
