package hw9;

public class Laptop {
    private String brand;
    private String color;
    private String software;

    public Laptop() {

    }

    public void setBrand(String b) {
        brand = b;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color){
        this.color=color;
    }
    public void setSoftware(String software){
        this.software=software;

    }



    public void printInfo(){
        System.out.println("Laptop{"+"brand='" +
               brand+'\''+",color='"+color+'\''+
                ",software='"+software+'}');
    }

    public String getColor() {
        return color;
    }

    public String getSoftware() {
        return software;
    }

    public Laptop(String brand, String color, String software) {
        this.brand = brand;
        this.color = color;
        this.software = software;
    }
}


