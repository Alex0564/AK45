package hw10df;

public class Animal {
    protected String name;
    protected String kind;
    protected int year;
    protected Object Gender;

    public Animal(){

    }
    public Gender getGender() {
        return (hw10df.Gender) Gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGender(Object gender) {
        Gender = gender;
    }

    public Animal(String name, String kind, int year) {
        this.name = name;
        this.kind = kind;
        this.year = year;


        
        
    }
    
}
