public class Teacher extends Person {

    private int salary;

    public Teacher(String fullName, String fullAddress, int salary) {
        super(fullName, fullAddress);
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return super.getFullName() + "\n  " + super.getFullAddress() + "\n  salary " + this.salary + " euro/month";
    }
}
