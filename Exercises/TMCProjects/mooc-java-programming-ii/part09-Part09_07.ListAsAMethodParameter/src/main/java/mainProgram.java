import java.util.ArrayList;
import java.util.List;

public class mainProgram {

    public static void main(String[] args) {
        // test your method here
        List<String> stringList = new ArrayList<>();
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");

        System.out.println(returnSize(stringList));
    }

    // Implement here a method returnSize which returns the size of the list given to it as a parameter

    public static int returnSize(List<String> stringList) {
        return stringList.size();
    }

}
