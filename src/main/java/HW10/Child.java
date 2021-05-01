package HW10;

public class Child {
    public String name;
    public String year;
    public Object major;
    public String lastName;



    public Child() {
        this.name = name;
        this.year = year;
        this.major = major;
        this.lastName = lastName;
    }

    public Child(Subjects major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public Object getMajor() {
        return major;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setMajor(Subjects major) {
        this.major = major;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

