public class Exercise {
    private String name;

    private boolean completed;

    public Exercise(String name) {

        this.name = name;

        this.completed = false;
    }

    Exercise() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {

        return name;
    }

    public void setCompleted(boolean completed) {

        completed = completed;
    }

    public boolean isCompleted() {

        return this.completed;
    }
}
