package hw9df;

public class Worker {

    private String name;
    private String lastName;
    private String position;

    public Worker(String name, String lastName, String position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }


    public void work() {
        System.out.println(position + " " + name + " finish his work");


    }
}