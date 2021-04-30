package UmidaLesson10HW;


public class App {
    public static void main(String[] args) {
        System.out.println("---------------------1st child class Cake");
        Cake BdayCake = new Cake("bdayCake", "chocolateSponge", 45, "strawberries");
        String CakeInfo = BdayCake.getCakeInfo();

        System.out.println(CakeInfo);


        System.out.println("---------------------2nd child class IceCream");
        IceCream Magnat = new IceCream("Magnat", "vanilla", 13, "syrup");
        String IceCreamInfo = Magnat.getIceCreamInfo();

        System.out.println(IceCreamInfo);


        System.out.println("---------------------3rd child class Pastry");
        Pastry Danish = new Pastry("Danish", "plain", 7, "raspberryCream");
        String PastryInfo = Danish.getPastryInfo();

        System.out.println(PastryInfo);
    }
}
