import java.util.ArrayList;

public class User {
    protected int id;
    protected String name;
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
        System.out.println("Book borrwed: " + book.getTitle());
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setIsBorrowed(false);
        System.out.println("Book returned: " + book.getTitle());
    }

    public void viewBorrowedBooks() {
        System.out.println("Books borrowed by user: ");
        for (Book book : borrowedBooks) {
            System.out.println("Title: " + book.getTitle());
        }
    }

}
