package ArtuomLesson12HW;

import ArtuomLesson12HW2.ICars;

public class MyCoffeemachine implements IEuropeanElectricPlug{

    private String brand;
    private String model;
    private int yearCreated;

    public MyCoffeemachine(String brand, String model, int yearCreated) {
        this.brand = brand;
        this.model = model;
        this.yearCreated = yearCreated;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }


    @Override
    public void europeanPlug() {
        System.out.println("I keep standard and can be used in Spain");
    }

    @Override
    public void caps(){
        System.out.println("CAPS=10g");
    }


    public void getPrintCof() {
        System.out.println( "MyCoffeemachine{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearCreated=" + yearCreated +
                '}');
    }
}
