package TMLess12;

public class MyPrinter implements IAmericanElectricalPlug{
    private String brand;
    private String model;

    public MyPrinter(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void print(String xx){
        System.out.println(brand+" "+model+" "+xx);
    }

    @Override
    public void americanPlug() {

        System.out.println("I keep standard and can be used in the USA");
    }

    @Override
    public int innerVoltage() {

        return 12;
    }
}
