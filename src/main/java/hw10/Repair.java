package hw10;

public class Repair extends Car {
    private String problem;

    public Repair() {
    }

    public Repair(String name, String model, String color, int year, String problem) {
        super(name, model, color, year);
        this.problem = problem;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
}
