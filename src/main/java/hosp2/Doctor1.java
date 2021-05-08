package hosp2;

public class Doctor1 {
    private String name1;
    private String lastName1;
    private Position1 position1;

    public Doctor1(String name1, String lastName1, Position1 position1) {
        this.name1 = name1;
        this.lastName1 = lastName1;
        this.position1 = position1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public Position1 getPosition1() {
        return position1;
    }

    public void setPosition1(Position1 position1) {
        this.position1 = position1;
    }
    public void printDoctor1(){
        System.out.println(name1 + " " + lastName1 + ": " + position1);
    }

    @Override
    public String toString() {
        return name1 + " " + lastName1 + ": " + position1;
    }
}
