package less10homework;

public class book extends Page {
    private String genre;
    private String name;

    public book (String name, String genre, String type, String size){
        super(type, size);
        this.name = name;
        this.genre = genre;
    }


}
