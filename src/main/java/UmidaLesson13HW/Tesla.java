package UmidaLesson13HW;

public class Tesla implements ICars {
    protected String color;
    protected String model;

    public Tesla(String color, String model) {
        this.color = color;
        this.model = model;
    }

    @Override
    public void acceleration() {
        System.out.println(color+" "+model+" can accelerate up to 100m/h.");
    }

    @Override
    public void emergencyWarning() {
        System.out.println(color+" "+model+" lets the driver know about hazardous areas.");
    }
}
