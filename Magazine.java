import java.util.List;

public class Magazine extends Item {
    private int publicationYear;
    private int volume;
    private String publisher;
    private List<String> topics;

    public Magazine(String id, String name, String acquisitionDate, List<String> authors, int publicationYear, int volume, String publisher, List<String> topics) {
        super(id, name, acquisitionDate, authors);
        this.publicationYear = publicationYear;
        this.volume = volume;
        this.publisher = publisher;
        this.topics = topics;
    }

    // Getters and setters for magazine-specific attributes
}


