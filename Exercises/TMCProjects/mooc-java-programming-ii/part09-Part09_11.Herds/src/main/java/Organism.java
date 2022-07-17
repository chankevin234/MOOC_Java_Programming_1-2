public class Organism implements Movable {
    // An organism should know its own location (as x, y coordinates).

    private int organismX;
    private int organismY;

    public Organism(int x, int y) {
        this.organismX = x;
        this.organismY = y;
    }

    public String toString() {
        return "x: " + organismX + "; y: " + organismY;
    }

    @Override
    public void move(int dx, int dy) {
        // Moves the object by the values it receives as parameters.
        // The dx variable contains the change to coordinate x, and the dy variable contains the change to the coordinate y.
        // For example, if the value of dx is 5, the value of the object variable x should be incremented by five.

        organismX += dx;
        organismY += dy;
    }

}
