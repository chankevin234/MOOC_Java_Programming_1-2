public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object compared) {
        //compares the new book added to the existing ones in the list
        //.contains will use this function

        //checks if the location of compared is same as existing object
        if (this == compared) {
            return true;
        }

        //checks if the incoming object is even a "Book"
        if (!(compared instanceof Book)) {
            return false;
        }

        Book comparedBook = (Book) compared; //converts the compared object into Book type

        //checks if the name and pub date are the same.. if so, return true
        // **below code could also be written as:
        // return this.name.equals(comparedBook.name) && this.publicationYear == comparedBook.publicationYear
        if (this.name.equals(comparedBook.name) && this.publicationYear == comparedBook.publicationYear) {
            return true;
        }

        return false;

    }

}
