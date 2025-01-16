import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    protected ArrayList<Book> borrowedBooks;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.setIsBorrowed(true);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setIsBorrowed(false);
    }

    public void viewBorrowedBooks() {
        for (Book book : borrowedBooks) {
            System.out.println("Details: " + book.getTitle());
        }
    }

}
