package hw13;

public class Staff {
    private String name;
    private double salary;
    private int time;

    public Staff(String name, double salary, int time) {
        this.name = name;
        this.salary = salary;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", time=" + time +
                '}';
    }

}
