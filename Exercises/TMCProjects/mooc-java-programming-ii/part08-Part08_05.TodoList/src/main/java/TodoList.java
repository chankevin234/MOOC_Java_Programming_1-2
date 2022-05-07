import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todolist;

    public TodoList() {
        this.todolist = new ArrayList<String>();

    }

    public void add(String task) {
        this.todolist.add(task);
    }

    public void print() {
        int count = 1;
        for (String task : todolist) {
            System.out.println(count + ": "+ task);
            count += 1;
        }
    }

    public void remove(int number) {
        if (this.todolist.isEmpty()) {
            return;
        }
        int position = number - 1;
        this.todolist.remove(position);

    }
}
