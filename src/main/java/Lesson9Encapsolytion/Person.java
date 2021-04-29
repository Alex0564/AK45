package Lesson9Encapsolytion;

public class Person {
    private String name;
    private String lastname;
    private int year;

    public  void setName(String n){
        name =n;

    }
    public String getName(){
        return name;

    }
    public void setYear(int y){
        if(y>2021||y<1900){
            throw new IllegalArgumentException("Wrong year");
        }
        year=y;


    }
    public int getYear(){
        return year;
    }


}
