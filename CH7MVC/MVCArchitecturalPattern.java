package CH7MVC;

public class MVCArchitecturalPattern {

    public static void main(String[] args) {

        Book model = pullBookDetails();

        BookView view = new BookView();

        BookController con = new BookController(model, view);

        con.updateView();

        con.setBookTitle("Mastering Java 11");
        con.setBookISBN("978-1789137613");
        con.setBookYear(2018);
        con.updateView();
    }

    private static Book pullBookDetails() {
        Book book = new Book();
        book.setTitle("Mastering Java 9");
        book.setISBN("978-1786468734");
        book.setYear(2017);
        return book;
    }
}
