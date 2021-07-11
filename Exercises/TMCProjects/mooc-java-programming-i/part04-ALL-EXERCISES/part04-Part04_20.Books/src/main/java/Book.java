public class Book {
    private String title;
    private int pageNum;
    private int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pageNum = pages;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPageNum() {
        return this.pageNum;
    }


    public String toString() {
        return title + ", " + pageNum + " pages, " + year;
    }
}
