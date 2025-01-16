public class Member extends User {
    private int borrowLimit;

    public Member(int id, String name) {
        super(id, name);
        this.borrowLimit = 5;
    }

    public int getBorrowLimit() {
        return borrowLimit;
    }

    @Override
    public void borrowBook(Book book) {
        if (borrowedBooks.size() < borrowLimit) {
            super.borrowBook(book);
            System.out.println("Book borrowed successfully: " + book.getTitle());
        } else {
            System.out.println("Borrowing limit reached. You can only borrow up to " + borrowLimit + "books.");
        }

    }

    @Override
    public void viewBorrowedBooks() {
        System.out.println("Books borrowed by this member (Limit:" + borrowLimit + "): ");
        for (Book book : borrowedBooks) {
            System.out.println("Title: " + book.getTitle());
        }
    }

}
