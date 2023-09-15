import java.util.List;

public class Item {
    private String id;
    private String name;
    private String acquisitionDate;
    private List<String> authors;

    public Item(String id, String name, String acquisitionDate, List<String> authors) {
        this.id = id;
        this.name = name;
        this.acquisitionDate = acquisitionDate;
        this.authors = authors;
    }

    // Getters and setters for common attributes
}

