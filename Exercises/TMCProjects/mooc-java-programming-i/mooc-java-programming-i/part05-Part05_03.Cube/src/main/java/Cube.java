public class Cube {
    private int edgeLength;

    public Cube(int initialEdgeLength) {
        this.edgeLength = initialEdgeLength;
    }

    public int volume() {
        return (int) Math.pow(this.edgeLength, 3); //cubed
    }

    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume();
    }
}
