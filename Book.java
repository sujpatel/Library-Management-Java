public class Book {
    private int id;
    private String title;
    private String author;
    private String category;
    private boolean isBorrowed;

    public Book(int id, String title, String author, String category, boolean isBorrowed) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.isBorrowed = isBorrowed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

}
