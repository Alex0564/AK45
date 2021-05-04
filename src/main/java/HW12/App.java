package HW12;

public class App {
    public static void main(String[] args) {
        IGasoline mercedes = new GermanCars("Mercedes-Benz", "AMG GLE 63", 2020);
        IGasoline audi = new GermanCars("Audi", "A8", 2021);

        mercedes.PremiumGas();
        System.out.println("\n");
        audi.PremiumGas();


//        IGasoline[] GermanCars = {mercedes, audi};
//        for (IGasoline v : GermanCars) {
//            v.PremiumGas();

            System.out.println("\n");

            IGasoline shell = new GasStations("Shell", 3.56);
            IGasoline exxon = new GasStations("Exxon", 3.46);

            shell.PremiumGas();
            exxon.PremiumGas();

            }
        }
//}

