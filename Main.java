import java.util.Scanner;
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
}

public class CD extends Item {
    private String genre;
    private List<String> tracks;

    public CD(String id, String name, String acquisitionDate, List<String> authors, String genre, List<String> tracks) {
        super(id, name, acquisitionDate, authors);
        this.genre = genre;
        this.tracks = tracks;
    }
}

public class Main(){
    public class void main(String args[]){
        Scanner scanner = new Scanner(System.in);


 //ArrayList<Integer> lista = new ArrayList<>();

//Criando uma lista usando o método List:
       //List lista_1 = new ArrayList<Integer>();

    }
}