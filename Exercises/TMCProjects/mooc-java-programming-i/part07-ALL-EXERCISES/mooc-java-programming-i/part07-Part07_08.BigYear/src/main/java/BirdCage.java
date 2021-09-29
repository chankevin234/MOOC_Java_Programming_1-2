import java.util.ArrayList;

public class BirdCage {

    private ArrayList<Bird> birdCage;

    public BirdCage() {
        this.birdCage = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        if (!alreadyExists(bird.getName(), bird.getLatinName())) {
            birdCage.add(bird);
//            System.out.println(birdCage);
        } else {
            System.out.println("Bird aldready exists, not added");
        }
    }

    public void addObservation(String birdName) {
         for (Bird bird : birdCage) {
             if (bird.getName().equals(birdName)) {
                 bird.addObservation();
                 return;
             }
         }
         System.out.println("Not a bird!");
    }

    public void printAll() {
        if (birdCage.size() == 0) {
            System.out.println("Empty");
            return;
        }

        for (Bird bird : birdCage) {
            System.out.println(bird);
        }
    }

    public void printOne(String birdName) {
        for (Bird bird : birdCage) {
            if (bird.getName().equals(birdName)) {
                System.out.println(bird);
            }
        }
    }

    public boolean alreadyExists(String name, String latinName) {
        for (Bird bird : birdCage) {
            if (bird.getName().equals(name) || bird.getLatinName().equals(latinName)) {
                return true;
            }
        }
        return false;
    }

}
