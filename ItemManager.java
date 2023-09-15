import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter item details:");

        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Acquisition Date: ");
        String acquisitionDate = scanner.nextLine();

        System.out.print("Number of Authors: ");
        int authorCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<String> authors = new ArrayList<>();
        for (int i = 0; i < authorCount; i++) {
            System.out.print("Author " + (i + 1) + ": ");
            authors.add(scanner.nextLine());
        }

        System.out.print("Item Type (Book/CD/DVD/Magazine): ");
        String itemType = scanner.nextLine();

        switch (itemType.toLowerCase()) {
            case "book":
                System.out.print("Publisher: ");
                String publisher = scanner.nextLine();
                System.out.print("Publication Year: ");
                int publicationYear = scanner.nextInt();
                // Create a Book object
                Book book = new Book(id, name, acquisitionDate, authors, publisher, publicationYear);
                // Handle book-specific attributes here
                break;
            case "cd":
                System.out.print("Genre: ");
                String genre = scanner.nextLine();
                System.out.print("Number of Tracks: ");
                int trackCount = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                List<String> tracks = new ArrayList<>();
                for (int i = 0; i < trackCount; i++) {
                    System.out.print("Track " + (i + 1) + ": ");
                    tracks.add(scanner.nextLine());
                }
                // Create a CD object
                CD cd = new CD(id, name, acquisitionDate, authors, genre, tracks);
                // Handle CD-specific attributes here
                break;
            case "dvd":
                System.out.print("Type (musical/movie/data): ");
                String type = scanner.nextLine();
                System.out.print("Description: ");
                String description = scanner.nextLine();
                // Create a DVD object
                DVD dvd = new DVD(id, name, acquisitionDate, authors, type, description);
                // Handle DVD-specific attributes here
                break;
            case "magazine":
                System.out.print("Publication Year: ");
                int magPublicationYear = scanner.nextInt();
                System.out.print("Volume: ");
                int volume = scanner.nextInt();
                System.out.print("Publisher: ");
                String magPublisher = scanner.nextLine();
                scanner.nextLine(); // Consume the newline character
                System.out.print("Number of Topics: ");
                int topicCount = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                List<String> topics = new ArrayList<>();
                for (int i = 0; i < topicCount; i++) {
                    System.out.print("Topic " + (i + 1) + ": ");
                    topics.add(scanner.nextLine());
                }
                // Create a Magazine object
                Magazine magazine = new Magazine(id, name, acquisitionDate, authors, magPublicationYear, volume, magPublisher, topics);
                // Handle magazine-specific attributes here
                break;
            default:
                System.out.println("Invalid item type.");
                return;
        }

        // Perform any additional processing or storage here based on the item type.
        System.out.println("Item created successfully!");
        
        
    }
}
