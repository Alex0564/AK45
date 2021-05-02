package hw11;

public class Disk {
    private String brand;
    private String model;
    private int size;
    public Disk (String brand, String model, int size){
        this.brand = brand;
        this.model = model;
        this.size = size;
    }
    public String getBrand(){return brand;}
    public String getModel(){return model;}
    public int getSize(){return size;}

}
