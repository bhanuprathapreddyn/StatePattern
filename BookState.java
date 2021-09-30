package StatePattern;

public interface BookState {
    void issue(Book book);
    void returnBook(Book book);
    void reserve(Book book);
}

