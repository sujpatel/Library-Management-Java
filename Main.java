public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Library Management System!");

        Book book = new Book(1, "Java Basics", "John Doe", "Programming", false);

        System.out.println("Book details:");
        System.out.println("ID: " + book.getId());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Category: " + book.getCategory());
        System.out.println("Borrowed: " + book.getIsBorrowed());

        book.setIsBorrowed(true);
        System.out.println("\nAfter Borrowing:");
        System.out.println("Borrowed: " + book.getIsBorrowed());

        book.setIsBorrowed(false);
        System.out.println("\nAfter Returning:");
        System.out.println("Borrowed: " + book.getIsBorrowed());

    }
}
