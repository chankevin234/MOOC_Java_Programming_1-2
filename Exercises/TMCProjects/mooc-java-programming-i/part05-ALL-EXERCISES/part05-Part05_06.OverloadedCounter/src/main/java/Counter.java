public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        increase(1); //calls the other version of this method with more params
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value = this.value + increaseBy;
        }
    }

    public void decrease() {
        decrease(1);
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value = this.value - decreaseBy;

        }
    }
}
