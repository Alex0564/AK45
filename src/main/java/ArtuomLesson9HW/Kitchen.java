package ArtuomLesson9HW;

public class Kitchen {
    private String furniture;
    private String ElectricalDevices;
    private int SQft;


    public Kitchen(String furniture, String electricalDevices, int SQft) {
        this.furniture = furniture;
        this.ElectricalDevices = electricalDevices;
        this.SQft = SQft;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setElectricalDevices(String electricalDevices) {
        ElectricalDevices = electricalDevices;
    }

    public String getElectricalDevices() {
        return ElectricalDevices;
    }

    public void setSQft(int SQft) {
        this.SQft = SQft;
    }

    public int getSQft() {
        return SQft;
    }

    public Kitchen( String electricalDevices, int SQft) {
        this.ElectricalDevices = electricalDevices;
        this.SQft = SQft;

    }

    public Kitchen() {
    }

    public void printfloor(){
        System.out.println( "On the 3 floor we have three flat we have kitchen with "+this.furniture+this.ElectricalDevices+" "+ "and SQft= "+this.SQft);

        printClass();



    }
    public void printClass(){
        System.out.println("On the 4th flor we have kichen with " +this.ElectricalDevices +" On the 5fh floor we have mpt kitchen");
    }
}
