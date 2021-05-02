package Lesson9Encapsolytion;

public class Person {
    private String name;
    private String lastname;
    private int year;

    public  void setName(String name){
        this.name =name;

    }
    public String getName(){
        return name;

    }
    public void setYear(int year){
        if(year>2021||year<1900){
            throw new IllegalArgumentException("Wrong year");
        }
        this.year=year;


    }
    public int getYear(){
        return year;
    }


}
