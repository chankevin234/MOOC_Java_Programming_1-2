public class Bird {

    private String name;
    private String latinName;
    private int observationCount;

    public Bird(String name, String latin){
        this.name = name;
        this.latinName = latin;
        this.observationCount = 0;
    }

    public void addObservation() {
        this.observationCount++;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int getObservationCount() {
        return this.observationCount;
    }

    @Override
    public String toString() {
        return this.name
                + "(" +this.latinName
                +"): "
                + this.observationCount
                + " observations";
    }
}
