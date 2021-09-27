public class Gift {
    /*/represents different kinds of gifts and records:
    i) name
    ii) weight in kg
     */

    private String name;
    private int weight;

    public Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        return this.name + " " + "(" + this.weight + " kg)";
    }

}
