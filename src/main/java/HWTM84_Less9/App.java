package HWTM84_Less9;

public class App {
    public static void main(String[] args) {
        Drivers driver01 = new Drivers();
        driver01.setDrivers("Jason","Born","T122-3456-48-72","7737127373");
        Drivers driver02 = new Drivers();
        driver02.setDrivers("John","Chan","T122-7823-47-96","7054513777");
        Drivers driver03 = new Drivers();
        driver03.setDrivers("Mark", "Yan", "T122-4782-36-71", "7726587213");

        Trucks trucks01 = new Trucks();
        trucks01.setMake("FORD");
        trucks01.setModel("F350");
        trucks01.setYear(2019);
        trucks01.setLicense("BR10100");
        trucks01.setDriver("Jason");

        Trucks trucks02 = new Trucks();
        trucks02.setMake("DODGE");
        trucks02.setModel("HD3500");
        trucks02.setYear(2020);
        trucks02.setLicense("AF12354");
        trucks02.setDriver("John");


        trucks02.printInfo();
        driver02.printInfo();
    }
}
