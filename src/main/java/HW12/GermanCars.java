package HW12;

public class GermanCars implements IGasoline {
    private String make;
    private String model;
    private int year;

    public GermanCars(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }


    @Override
    public void PremiumGas() {
        System.out.println("PREMIUM GAS ONLY! "+"("+OctaneLevelPremium()+")"+"\n"+make+"\n"+model+"\n"+year);

    }

    @Override
    public int OctaneLevelPremium() {
        return 93;
    }
}
