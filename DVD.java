import java.util.List;

public class DVD extends Item {
    private String type; // e.g., "musical," "movie," "data"
    private String description;

    public DVD(String id, String name, String acquisitionDate, List<String> authors, String type, String description) {
        super(id, name, acquisitionDate, authors);
        this.type = type;
        this.description = description;
    }

    // Getters and setters for DVD-specific attributes
}

