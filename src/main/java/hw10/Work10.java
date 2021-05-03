package hw10;

public class Work10 {
    public static void main(String[]args){

        Rent car1 = new Rent("Mazda", "5","White",2006,"3 days");
        System.out.println(car1.getName());
        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getYear());
        System.out.println(car1.getPeriod());


        Sale car2 = new Sale("Toyota","Highlander","Black",2017,15);
        System.out.println(car2.getName());
        System.out.println(car2.getModel());
        System.out.println(car2.getColor());
        System.out.println(car2.getYear());
        System.out.println(car2.getDiscount());


        Repair car3 = new Repair("Opel","Astra","Red",1997,"Exhaust system doesn't work properly");
        System.out.println(car3.getName());
        System.out.println(car3.getModel());
        System.out.println(car3.getColor());
        System.out.println(car3.getYear());
        System.out.println(car3.getProblem());

    }
}
