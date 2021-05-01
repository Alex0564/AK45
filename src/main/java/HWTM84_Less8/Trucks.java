package HWTM84;

public class Trucks {
    public int year;
    public String make;
    public String model;
    public String license;
    public String driver;

    public String getInfo(){
        return license+" /"+make+" "+model+" Driver is "+driver;
    }
}
