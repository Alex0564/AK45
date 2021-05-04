package HW12;

public class GasStations implements IGasoline {
    private String name;
    private double price;

    public GasStations(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void PremiumGas() {
        System.out.println(name+"\n("+OctaneLevelPremium()+")"+" Premium Gas - "+"$"+price);
    }

    @Override
    public int OctaneLevelPremium() {
        return 93;
    }
}
