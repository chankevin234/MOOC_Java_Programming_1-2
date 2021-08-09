public class HealthStation {
    private int weightings;

    public HealthStation() {
        this.weightings = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weightings += 1;
        return person.getWeight();
    }

    public void feed(Person person) {
        int weight = person.getWeight() + 1;

        person.setWeight(weight);
    }

    public int weighings() {
        return this.weightings;
    }

}
