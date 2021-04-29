package homework9x;

public class Student {
    private String name;
    private String lastName;
    private String addressOfschool;

    public Student(String name, String lastName, String addressOfschool) {
        this.name = name;
        this.lastName = lastName;
        this.addressOfschool = addressOfschool;
    }

    public Student() {
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }


    public void setAddressOfschool(String addressOfschool) {
        this.addressOfschool = addressOfschool;
    }
    public String getAddressOfschool() {
        return addressOfschool;
    }


    public void printInfo() {
        System.out.println("Info about Student:" + "\nName: " + name + "\nLastName: " + lastName + "\nAddress of School: " + addressOfschool);
    }
}
