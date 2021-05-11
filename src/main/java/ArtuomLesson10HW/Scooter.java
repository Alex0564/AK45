package ArtuomLesson10HW;

public class Scooter extends Transport{
    private int Age;

    public Scooter(String type, String brand, int year, int age) {
        super(type, brand, year);
        this.Age = age;

    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }
}
