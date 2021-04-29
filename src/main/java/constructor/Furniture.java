package constructor;

public class Furniture {
    private String typeFurniture;
    private String conditionFurniture;
    private String colorFurniture;

    public Furniture(String typeFurniture, String conditionFurniture, String colorFurniture){
        this.typeFurniture = typeFurniture;
        this.conditionFurniture = conditionFurniture;
        this.colorFurniture = colorFurniture;
    }
    public Furniture(){}

    public void setTypeFurniture(String typeFurniture){
        this.typeFurniture = typeFurniture;
    }
    public void setConditionFurniture(String conditionFurniture){
        this.conditionFurniture = conditionFurniture;
    }
    public void setColorFurniture(String colorFurniture){
        this.colorFurniture = colorFurniture;
    }

    public void printFurniture(){
        System.out.println("Type = " + typeFurniture + "\nCondition = " + conditionFurniture + "\nColor = " + colorFurniture);
    }
}
