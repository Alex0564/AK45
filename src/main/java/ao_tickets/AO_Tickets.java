package ao_tickets;

public class AO_Tickets {
    private int age;
    private double basePrice;

    public AO_Tickets(int age, double basePrice) {
        this.age = age;
        this.basePrice = basePrice;
    }

    public double getPrice(){
        if(age<=2){
            return 0;
        }
        if(age<13){
            return basePrice*0.5;
        }
        if(age>=65){
            return basePrice*0.8;
        }
        return basePrice;
    }
}
