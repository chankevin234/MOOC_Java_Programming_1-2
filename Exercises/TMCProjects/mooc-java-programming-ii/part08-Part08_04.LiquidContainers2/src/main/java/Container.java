public class Container {
    private int space;

    public Container() {
        this.space = 0;
    }
    /*
    adds the amount of liquid specified by the parameter to the first container.
    The inserted amount must be specified as an integer.
    The container can't hold more than a hundred liters and everything added past that will go to waste.
     */
    public void add(int amount) {
        if (amount < 0) {
            System.out.println("Negative amount");
        }
        else if (this.contains() + amount < 100) {
            this.space += amount;
        }
        else {
            this.space = 100;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            System.out.println("Negative amount");
        }
        else if (this.contains() - amount < 0) {
            System.out.println("Container is empty");
            this.space = 0;
        }
        else {
            this.space -= amount;
        }
    }

    public int contains() {
        return this.space;
    }

    @Override
    public String toString() {
        return this.contains() +
                "/100";
    }
}
