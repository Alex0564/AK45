package hw11;

public class PowerSupply {
    private String brand;
    private String model;
    public PowerSupply (String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public String getBrand(){return brand;}
    public String getModel(){return model;}

    @Override
    public String toString() {
        return "\nPowerSupply{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
