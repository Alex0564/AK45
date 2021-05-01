package HWTM84_Less11;

public class Systemblock {
    private Motherboard motherboard;
    private HDD hdd;
    private PowerSupply powerSupply;
    private VGA vga;

    public Systemblock(Motherboard motherboard, HDD hdd, PowerSupply powerSupply, VGA vga) {
        this.motherboard = motherboard;
        this.hdd = hdd;
        this.powerSupply = powerSupply;
        this.vga = vga;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public VGA getVga() {
        return vga;
    }

    public void setVga(VGA vga) {
        this.vga = vga;
    }
}
