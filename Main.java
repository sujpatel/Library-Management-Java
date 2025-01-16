public class Main {
    public static void main(String[] args) {
        Member member = new Member(1, "John Doe");
        Book book1 = new Book(101, "Java Basics", "John Author", "Programming", false);
        Book book2 = new Book(102, "Python 101", "Jane Author", "Programming", false);
        Book book3 = new Book(103, "C++ Fundamentals", "James Author", "Programming", false);
        Book book4 = new Book(104, "Data Structures", "Emily Author", "Education", false);
        Book book5 = new Book(105, "Algorithms Made Easy", "Alice Author", "Education", false);
        Book book6 = new Book(106, "Artificial Intelligence", "Bob Author", "Technology", false);

        member.borrowBook(book1);
        member.borrowBook(book2);
        member.borrowBook(book3);
        member.borrowBook(book4);
        member.borrowBook(book5);

        member.borrowBook(book6);

        System.out.println("\nBorrowed Books:");
        member.viewBorrowedBooks();

    }
}
