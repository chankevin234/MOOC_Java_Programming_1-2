public class Book {
    private String author;
    private String title;
    private int pageCount;

    public Book(String intialAuthor, String intialTitle, int initialPageCount) {
        this.author = intialAuthor;
        this.title = intialTitle;
        this.pageCount = initialPageCount;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.title;
    }

    public int getPages() {
        return this.pageCount;
    }

    public String toString() {
        return this.author + ", " + this.title + ", " + this.pageCount + " pages";

    }

}

