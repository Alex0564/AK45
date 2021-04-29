package lesson9x;

public class Person {
    private String name;
    private String LastName;
    private int year;

    public void setName(String n ){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setYear(int y){

        if (y>2021 || y<1900){
            throw new IllegalArgumentException("Wrong year, please use valid numbers");
        }
       year=y;
    }
    public int getYear(){
        return year;
    }

    public void setLastName(String LastName){
        this.LastName=LastName;
    }

}
