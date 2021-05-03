package HM11;

public class Person {
    private Adress adress;
    private String name;
    private String lastName;
    private String year;

    public Person(Adress adress, String name, String lastName, String year) {
        this.adress = adress;
        this.name = name;
        this.lastName = lastName;
        this.year = year;


    }

    public Adress getAdress() {
        return this.adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}


