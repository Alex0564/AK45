package less11homework;

public class Monitor {
    private String brand;
    private String model;
    private int diag;
    public Monitor (String brand, String model, int diag){
        this.brand = brand;
        this.model = model;
        this.diag = diag;
    }
    public String getBrand(){return brand;}
    public String getModel(){return model;}
    public int getDiag(){return diag;}

    @Override
    public String toString() {
        return "\nMonitor{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", diag=" + diag +
                '}';
    }
}
