package mytest;

public class Human {
    private int age;
    protected int year;

    public Human(int age, int year) {
        this.age = age;
        this.year = year;
    }

    public Human() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void infoMyHuman() {
        System.out.println(age);
    }
}
