import java.util.ArrayList;

public class Room {
    /*/
    contains list of persons
     */

    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }

    public void add(Person person) {
        this.room.add(person);

    }

    public boolean isEmpty() {
        if (this.room.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.room;
    }

    public Person shortest() {
        if (this.room.isEmpty()) {
            return null;
        }

        Person shortest = this.room.get(0);
        for (Person person : room) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {
        if (this.room.isEmpty()) {
            return null;
        }

        Person returnObj = shortest();
        this.room.remove(returnObj);
        return returnObj;

    }

}