public class Person {

    private String fullName;
    private String fullAddress;

    public Person(String fullName, String fullAddress) {
        this.fullName = fullName;
        this.fullAddress = fullAddress;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getFullAddress() {
        return this.fullAddress;
    }

    public String toString() {
        return this.fullName + "\n  " + fullAddress;
    }
}
