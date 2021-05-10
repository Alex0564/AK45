package lesson9my;

public class Person {
    private String name;
    private String lastName;
    private int year;

//    public void setName (String n){ name = n;}
//    public String getName() {return name;}
//
//    public void setLastName (String lastName) {this.lastName = lastName;}
//    public String getLastName(){return lastName;}
//
//    public void setYear (int year){this.year = 1963;}
//    public int getYear() {return 1900;}

    public Person (String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }
    public Person (String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public void setYear (int year){this.year = year;}
    public int getYear(){return year;}

    public Person(){} // конструктор вместо деффолтного конструктора, для создания пустых имен


}

