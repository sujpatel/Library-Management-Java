public class Librarian extends User {
    public Librarian(int id, String name) {
        super(id, name);
    }

    public void addBook(Book book, Library library) {
        library.addBook(book);
        System.out.println("Book added to the library: " + book.getTitle());
    }
}
