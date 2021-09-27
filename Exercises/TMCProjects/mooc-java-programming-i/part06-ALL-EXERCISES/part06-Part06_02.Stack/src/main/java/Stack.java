import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>(); //initializaes a new arraylist object called "stack"
    }

    public boolean isEmpty() {
        if (this.stack.isEmpty()) { //return true if the stack is empty
            return true;
        }
        return false;
    }

    public void add(String value) {
        this.stack.add(value); //add to the stack arraylist
    }

    public ArrayList<String> values() {
        return this.stack; //returns the arraylist
    }

    public String take() {
        int stackLen = this.stack.size() - 1;
        return this.stack.remove(stackLen);
    }
}
