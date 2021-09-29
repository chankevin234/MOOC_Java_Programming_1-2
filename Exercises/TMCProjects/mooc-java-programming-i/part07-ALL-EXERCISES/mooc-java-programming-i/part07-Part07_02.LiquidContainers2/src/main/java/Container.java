public class Container {

    private int volume;

    public Container() {
        this.volume = 0;
    }

    public int contains() {
        return this.volume;
    }

    public void add(int amount) {
        if (amount < 0) {
            System.out.println("neg amount");
            return;
        }

        if (this.volume + amount >= 100) {
            this.volume = 100;
        } else {
            this.volume += amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            System.out.println("neg amount");
            return;
        }

        if (this.volume - amount < 0) {
            this.volume = 0;
        } else {
            this.volume -= amount;
        }
    }

    @Override
    public String toString() {
        return contains() + "/100";
    }

}
