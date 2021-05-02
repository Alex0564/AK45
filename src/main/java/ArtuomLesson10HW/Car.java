package ArtuomLesson10HW;

public class Car extends Transport{
    private String typeengine;

    public Car(String type, String brand, int year, String typeengine) {
        super(type, brand, year);
        this.typeengine = typeengine;

    }

    public String getTypeengine() {
        return typeengine;
    }

    public void setTypeengine(String typeengine) {
        this.typeengine = typeengine;
    }

    public void printClassCar(){
        System.out.println("Jeep Landcruser: "+this.Type+" "+this.Brand+" "+this.year+" "+this.typeengine);
    }
}

