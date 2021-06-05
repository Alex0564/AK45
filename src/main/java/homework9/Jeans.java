package homework9;

public class Jeans {
    private String brand;
    private String color;
    private String size;

    public Jeans (String brand, String color, String size){
        this.brand = brand;
        this.color = color;
        this.size = size;
    }
    public  Jeans(){}

    public void setBrand (String brand){this.brand = brand;}
    public String getBrand(){return brand;}
    public void setColor (String color){this.color = color;}
    public String getColor(){return color;}
    public void setSize (String size){this.size = size;}
    public String getSize(){return size;}

    public void printJeansInfo(){
        System.out.println("Jeans{Brand - "+brand+", Color - "+color+", Size - "+size+"}");
    }

}
