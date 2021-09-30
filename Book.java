package StatePattern;

class Book implements BookState {

    BookState currentState;
    String name;

    Book(String title) {
        this.name = title;
        currentState = new Available();
    }

    public void setState(BookState state) {
        this.currentState = state;
    }

    public void issue(Book book) {

        this.currentState.issue(this);
    }

    public void returnBook(Book book) {
        this.currentState.returnBook(this);

    }

    public void reserve(Book book) {

        this.currentState.reserve(this);
    }
}