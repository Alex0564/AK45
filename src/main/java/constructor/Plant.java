package constructor;

public class Plant {
    private String namePlant;
    private String colorPlant;
    private int agePlant;

    public Plant(String namePlant, String colorPlant, int agePlant){
        this.namePlant = namePlant;
        this.colorPlant = colorPlant;
        this.agePlant = agePlant;
    }
    public Plant(){}

    public void setNamePlant(String namePlant){
        this.namePlant = namePlant;
    }
    public void setColor(String colorPlant){
        this.colorPlant = colorPlant;
    }
    public void setAgePlant(int agePlant){
        this.agePlant = agePlant;
    }
    public void printPlant(){
        System.out.println("Name of Plant = " + namePlant + "\nColor = " + colorPlant + "\nAge = " + agePlant);
    }
}
