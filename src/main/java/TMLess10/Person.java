package TMLess10;

public class Person {
    protected String name;
    protected String lastName;
    protected int year;
    protected Gender gender;

    public Person(String name, String lastName, int year, Gender gender) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person(String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;

    }

    public Person() {
    }



    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
