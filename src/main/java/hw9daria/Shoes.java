package hw9daria;

public class Shoes {
    private String type;
    private String brand;
    private String material;
    private int size;

    public Shoes (String type, String brand, String material, int size){
        this.type=type;
        this.brand=brand;
        this.material=material;
        this.size=size;
    }

    public void getinfo (){
        System.out.println("The type of shoes is "+type+" and the brand is "+brand+
                ". Material is "+material+". And the size is "+size);}

    public Shoes (String type, String brand,String material){
        this.type=type;
        this.brand=brand;
        this.material=material;
    }
    public void setType(String type){ this.type=type; }
    public String getType( ) {return type; }

    public void setBrand(String Brand){ this.brand=brand; }
    public String getBrand( ) {return brand; }

    public void setMaterial(String material){ this.material=material; }
    public String getMaterial( ) {return material; }

    public void setSize(String Size){ this.size=size; }
    public int getSize( ) {return size; }


}
