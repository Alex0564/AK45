package lesson9HW;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setLastName(String ln){
        lastName = ln;
    }
    public String getLastName(){
        return lastName;
    }
    public void setYear(int y){
        year = y;
    }
    public int getYear(){
        return year;
    }

    public Person(){};

    public Person(String name, String lastName, int year){
        this.name = name;
        this.lastName = lastName;
        this.year = year;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void prinInfo(){
        System.out.println(Person "name= "+ name, "last name = "+ lastName, "Year = " + year);

    }

}
