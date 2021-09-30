package StatePattern;

public class Main {

    public static void main(String[] args) {

        Book b = new Book("Head First Design Pattern");
        b.returnBook(b);
        b.issue(b);
        b.issue(b);
        b.reserve(b);
        b.issue(b);
        b.returnBook(b);
        b.reserve(b);
        b.issue(b);

    }
}
