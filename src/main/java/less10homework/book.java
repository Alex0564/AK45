package less10homework;

public class book extends Page {
    private String genre;
    private String name;
    private String author;

    public book(){}

    public book (String name, String genre, String type, String size, String author){
        super(type, size);
        this.name = name;
        this.genre = genre;
    }
    public void bookInfo(){
        System.out.println("Book "+name+", genre "+genre);
    }
    public void setGenre (String genre){this.genre = genre;}
    public String getGenre(){return genre;}
    public void setAuthor (String author){this.author = author;}
    public String getAuthor(){return author;}
    public void setName (String name){this.name = name;}
    public String getName(){return name;}











}
