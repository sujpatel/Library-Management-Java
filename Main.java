import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(); // Initialize the library
        boolean running = true;

        System.out.println("Welcome to the Library Management System!");

        while (running) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Login as Librarian");
            System.out.println("2. Login as Member");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    librarianMenu(scanner, library);
                    break;

                case 2:
                    memberMenu(scanner, library);
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void librarianMenu(Scanner scanner, Library library) {
        boolean librarianRunning = true;

        while (librarianRunning) {
            System.out.println("\nLibrarian Menu:");
            System.out.println("1. Add a Book");
            System.out.println("2. Remove a Book by ID");
            System.out.println("3. View All Books");
            System.out.println("4. Search for Books");
            System.out.println("5. Logout");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add a Book
                    System.out.print("Enter book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book category: ");
                    String category = scanner.nextLine();

                    library.addBook(new Book(id, title, author, category, false));
                    break;

                case 2: // Remove a Book by ID
                    System.out.print("Enter book ID to remove: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    library.removeBookById(removeId);
                    break;

                case 3: // View All Books
                    library.viewAllBooks();
                    break;

                case 4: // Search for Books
                    System.out.print("Enter search query: ");
                    String query = scanner.nextLine();
                    library.searchBooks(query);
                    break;

                case 5: // Logout
                    System.out.println("Logging out...");
                    librarianRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void memberMenu(Scanner scanner, Library library) {
        boolean memberRunning = true;
        Member member = new Member(1, "John Doe"); // Example member

        while (memberRunning) {
            System.out.println("\nMember Menu:");
            System.out.println("1. Borrow a Book");
            System.out.println("2. Return a Book");
            System.out.println("3. View Borrowed Books");
            System.out.println("4. Search for Books");
            System.out.println("5. Logout");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Borrow a Book
                    System.out.print("Enter book ID to borrow: ");
                    int borrowId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Book bookToBorrow = null;

                    for (Book book : library.getBooks()) {
                        if (book.getId() == borrowId && !book.getIsBorrowed()) {
                            bookToBorrow = book;
                            break;
                        }
                    }

                    if (bookToBorrow != null) {
                        member.borrowBook(bookToBorrow);
                    } else {
                        System.out.println("Book not available or already borrowed.");
                    }
                    break;

                case 2: // Return a Book
                    System.out.print("Enter book ID to return: ");
                    int returnId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Book bookToReturn = null;

                    for (Book book : member.getBorrowedBooks()) {
                        if (book.getId() == returnId) {
                            bookToReturn = book;
                            break;
                        }
                    }

                    if (bookToReturn != null) {
                        member.returnBook(bookToReturn);
                    } else {
                        System.out.println("You have not borrowed this book.");
                    }
                    break;

                case 3: // View Borrowed Books
                    member.viewBorrowedBooks();
                    break;

                case 4: // Search for Books
                    System.out.print("Enter search query: ");
                    String query = scanner.nextLine();
                    library.searchBooks(query);
                    break;

                case 5: // Logout
                    System.out.println("Logging out...");
                    memberRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
