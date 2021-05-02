package lesson9hw;

public class Employee {
    private String name;
    private String lastName;
    private String position;
    private int experience;

    public Employee(String name, String lastName, String position, int experience) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.experience = experience;
    }

    public Employee(String name, String position, int experience) {
        this.name = name;
        this.position = position;
        this.experience = experience;
    }

    public Employee() {
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition(){
        return position;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public int getExperience(){
        return experience;
    }

    public void printInfo() {
        System.out.println("Employee name = " + name + ", Last Name = " + lastName + ", Position = " + position + ", Work experience = " + experience+" years");
    }
}
