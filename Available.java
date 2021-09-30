package StatePattern;

class Available implements BookState {

    public void issue(Book book) {
        book.setState(new Issued());
        System.out.println(book.name+" book issued successfully.");
    }

    public void returnBook(Book book) {
        System.out.println(book.name+" book is not issued yet. You have to get it issued first to return.");
    }

    public void reserve(Book book) {
        book.setState(new Reserved());
        System.out.println(book.name+" Book reserved successfully.");

    }
}