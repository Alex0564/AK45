package tickets;

public class Tickets {
    private int age;
    private double basePriec;

    public Tickets(int age, double basePriec) {
        this.age = age;
        this.basePriec = basePriec;
    }

    public double getPrice(){
        if (age<=2) {
            return 0;
        }
        if (age<13){
            return basePriec*0.5;
        }
        if (age>65){
            return basePriec*0.8;
        }
        return basePriec;

    }
}
