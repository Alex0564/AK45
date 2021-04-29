package HWTM84_Less9;

public class Trucks {
    private Model model;
    private Mark mark;
    private int year;
    public String license;
    public String driver;

    public void setYear(int year){
        this.year = year;
    }
    public int getYear() {return year;}
    public void setMake(Mark mark){
        this.mark = mark;
    }
    public Mark getMake() {return mark;}
    public void setModel(Model model){ this.model = model; }
    public Model getModel() {return model;}
    public void setLicense(String license) {this.license = license;}
    public String getLicense() {return license;}
    public void setDriver(String driver) {this.driver = driver;}
    public String getDriver() {return driver;}

    public void printInfo(){
        System.out.println("Truck: " + "mark= " + mark + ", model= " + model + ", year= " + year + ", driver= " + driver);
    }
}
