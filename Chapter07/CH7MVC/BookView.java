package CH7MVC;

public class BookView {

    public void printBookData(String bookTitle, String bookISBN, int bookYear) {
        System.out.println("\nBook Title : " + bookTitle);
        System.out.println("ISBN-13    : " + bookISBN);
        System.out.println("Pub. Year  : " + bookYear + "\n");
    }
}
