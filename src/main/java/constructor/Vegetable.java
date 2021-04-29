package constructor;

public class Vegetable {
    private String nameVegetable;
    private String colorVegetable;
    private String flavorVegetable;

    public Vegetable(String nameVegetable, String colorVegetable, String flavorVegetable){
        this.nameVegetable = nameVegetable;
        this.colorVegetable = colorVegetable;
        this.flavorVegetable = flavorVegetable;
    }
    public Vegetable(){}

    public void setNameVegetable(String nameVegetable){
        this.nameVegetable = nameVegetable;
    }
    public void setColorVegetable(String colorVegetable){
        this.colorVegetable = colorVegetable;
    }
    public void setFlavorVegetable(String flavorVegetable){
        this.flavorVegetable = flavorVegetable;
    }
    public void printVegetable(){
        System.out.println("Name of Vegetable = " + nameVegetable + "\nColor of Vegetable = " + colorVegetable + "\nFlavor of Vegetable = " + flavorVegetable);
    }
}
