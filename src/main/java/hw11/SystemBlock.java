package hw11;

public class SystemBlock {

    private PowerSupply powerSupply;
    private Disk disk;
    private MotherBoard motherBoard;

    public SystemBlock(PowerSupply powerSupply, Disk disk, MotherBoard motherBoard) {
        this.powerSupply = powerSupply;
        this.disk = disk;
        this.motherBoard = motherBoard;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }
}
