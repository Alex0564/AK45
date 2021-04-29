package homework9x;

public class Person {
    private String name;
    private String lastName;
    private double height;
    private int year;

    public Person(String name, String lastName, double height, int year){
        this.name=name;
        this.lastName=lastName;
        this.height=height;
        this.year=year;
    }


    public Person(){}
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }


    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }


    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }


    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }


    public void printInfo(){
        System.out.println("Info about Person:" + "\nName: " + name + "\nLastName: " + lastName + "\nDate of birth: " + year + "\nHeight: " + height);
    }

}

