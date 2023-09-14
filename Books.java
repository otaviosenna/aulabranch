import java.util.List;

public class Book extends Item {
    private String publisher;
    private int publicationYear;

    public Book(String id, String name, String acquisitionDate, List<String> authors, String publisher, int publicationYear) {
        super(id, name, acquisitionDate, authors);
        this.publisher = publisher;
        this.publicationYear = publicationYear;
    }

    // Getters and setters for book-specific attributes
}
