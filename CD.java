import java.util.List;

public class CD extends Item {
    private String genre;
    private List<String> tracks;

    public CD(String id, String name, String acquisitionDate, List<String> authors, String genre, List<String> tracks) {
        super(id, name, acquisitionDate, authors);
        this.genre = genre;
        this.tracks = tracks;
    }

    // Getters and setters for CD-specific attributes
}
