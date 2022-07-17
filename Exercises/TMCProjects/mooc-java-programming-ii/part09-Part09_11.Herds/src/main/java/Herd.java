import javafx.scene.input.KeyCombination;

import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    // A herd consists of multiple objects that implement the Movable interface.
    // They must be stored in e.g. a list data structure.

    private List<Movable> listOfOrganisms; //this list is filled of classes that implement "movable interface" (ex. Herd or Organism)

    public Herd() {
        this.listOfOrganisms = new ArrayList<>();
    }

    public String toString() {
        String newString = "";

        for (Movable mov : listOfOrganisms) {

            newString += mov.toString().trim() + "\n";
        }

        return newString;
    }

    public void addToHerd(Movable movable) {
        //adds an object that implements the Movable interface to the herd
        listOfOrganisms.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable organism : listOfOrganisms) {
            organism.move(dx, dy);
        }
    }
}
