import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        this.todoList.add(task);
    }

    public void print() {
        int index = 1;
        for (String task : this.todoList) {
            System.out.println(index + ": " + task);
            index++;
        }
    }

    public void remove(int number) {
        if (number > 0) {
            int index = number - 1;
            this.todoList.remove(index);
        }
    }

    public int size() {
        return this.todoList.size();
    }
}
