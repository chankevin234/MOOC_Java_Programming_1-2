public class Student extends Person {

    private int studyCredits;

    public Student(String fullName, String fullAddress) {
        super(fullName, fullAddress);
        this.studyCredits = 0;
    }

    public int credits() {
        return this.studyCredits;
    }

    public void study() {
        this.studyCredits += 1;
    }

    @Override
    public String toString() {
        return super.getFullName() + "\n  " + super.getFullAddress() + "\n  Study credits " + this.credits();
    }
}
