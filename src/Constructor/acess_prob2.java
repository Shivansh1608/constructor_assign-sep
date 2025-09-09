package Constructor;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("-----------------------------");
    }
}

class EBook extends Book {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);   // public → accessible
        System.out.println("Title: " + title); // protected → accessible in subclass
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Author: " + getAuthor()); // private → accessible via getter
        System.out.println("-----------------------------");
    }
}

public class acess_prob2 {
    public static void main(String[] args) {
        Book b1 = new Book("978-12345", "Java Basics", "James Gosling");
        b1.displayBookDetails();

        EBook eb1 = new EBook("978-67890", "Advanced Java", "Herbert Schildt", 5.6);
        eb1.displayEBookDetails();

        eb1.setAuthor("Updated Author");
        eb1.displayEBookDetails();
    }
}
