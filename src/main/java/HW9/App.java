package HW9;

public class App {
    public static void main(String[] args) {
        Phone smartphone=new Phone();
        smartphone.setBrand("Iphone");
        System.out.println(smartphone.getBrand());

        smartphone.setModel("12 MAX PRO");
        System.out.println(smartphone.getModel());

        smartphone.setPrice(1399);
        System.out.println("$ "+smartphone.getPrice());

        Vehicle car = new Vehicle("Honda", "Accord", 2019, 30000);
        Vehicle Toyota = new Vehicle();
        Toyota.setMake("Toyota");
        Toyota.setModel("Camry");
        Toyota.setYear(2018);
        Toyota.setOdometer(44000);


        car.printInfo();
        Toyota.printInfo();

        Paint Behr=new Paint();
        Behr.PaintColor = Color.BLACK;
        Behr.PaintColor2=Color.RED;
        Behr.PaintColor3=Color.WHITE;

        System.out.println(Behr.PaintColor);


    }
}
