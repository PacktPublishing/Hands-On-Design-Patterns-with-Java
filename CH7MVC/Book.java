package CH7MVC;

public class Book {

    private String isbn;
    private String title;
    private int year;


    // accessor methods
    public String getISBN() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }


    // mutator methods
    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
