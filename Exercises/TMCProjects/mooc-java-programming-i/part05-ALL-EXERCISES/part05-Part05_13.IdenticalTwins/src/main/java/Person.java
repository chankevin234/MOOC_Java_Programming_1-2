public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {
        if (this == compared) { //check if two objects in the same spot if so equal
            return true;
        }

        if (!(compared instanceof Person)) { //check if the compared is the same type of object
            return false; // returns false if the compared is not even the same type aka not a person!
        }
        //convert the object into a "Person" type object
        Person comparedPerson = (Person) compared;

        if (this.name.equals(comparedPerson.name) &&
                this.birthday.equals(comparedPerson.birthday) &&
                this.height == comparedPerson.height &&
                this.weight == comparedPerson.weight) {
            return true;
        }
        return false;
    }

}
