package HWTM84_Less9;

public class App {
    public static void main(String[] args) {
//------------------------Drivers----------------------------
        Drivers driver01 = new Drivers();
        driver01.setDrivers("Jason","Born","T122-3456-48-72","7737127373");
        Drivers driver02 = new Drivers();
        driver02.setDrivers("John","Chan","T122-7823-47-96","7054513777");
        Drivers driver03 = new Drivers();
        driver03.setDrivers("Mark", "Yan", "T122-4782-36-71", "7726587213");
//------------------------Trucks----------------------------
        Trucks trucks01 = new Trucks();
        trucks01.setMake(Mark.FORD);
        trucks01.setModel(Model.F350);
        trucks01.setYear(2019);
        trucks01.setLicense("BR10100");
        trucks01.setDriver(driver01.getName());

        Trucks trucks02 = new Trucks();
        trucks02.setMake(Mark.DODGE);
        trucks02.setModel(Model.HD3500);
        trucks02.setYear(2020);
        trucks02.setLicense("AF12354");
        trucks02.setDriver(driver02.getName());

//------------------------GetInfo----------------------------
        trucks02.printInfo();
        System.out.println(trucks01.getMake()+" License PL -"+trucks01.getLicense()+" Driver is "+trucks01.driver);
        driver02.printInfo();
        trucks01.printInfo();
        driver01.printInfo();
    }
}