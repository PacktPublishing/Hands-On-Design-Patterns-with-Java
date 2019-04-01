package CH7MVC;

public class BookController {
    private Book model;
    private BookView view;

    // constructor
    public BookController(Book model, BookView view) {
        this.model = model;
        this.view = view;
    }

    // accessor methods
    public String getBookTitle() {
        return model.getTitle();
    }

    public String getBookISBN() {
        return model.getISBN();
    }

    public int getBookYear() {
        return model.getYear();
    }

    // mutator methods
    public void setBookTitle(String title) {
        model.setTitle(title);
    }

    public void setBookISBN(String isbn) {
        model.setISBN(isbn);
    }

    public void setBookYear(int year) {
        model.setYear(year);
    }

    // update view method
    public void updateView() {
        view.printBookData(model.getTitle(), model.getISBN(), model.getYear());
    }
}
