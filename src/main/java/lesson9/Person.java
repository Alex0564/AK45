package lesson9;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setYear(int year){
        if(year>2021 || year<1900){
            throw new IllegalArgumentException("Wrong year");
        }
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
