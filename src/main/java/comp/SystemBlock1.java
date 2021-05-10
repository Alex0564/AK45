package comp;

public class SystemBlock1 {
    private PowerSupply1 powerSupply;
    private Disk1 disk;
    private GraphicAdapter1 graphicAdapter;
    private MotherBoard1 motherBoard;

    public SystemBlock1(PowerSupply1 powerSupply, Disk1 disk, GraphicAdapter1 graphicAdapter, MotherBoard1 motherBoard) {
        this.powerSupply = powerSupply;
        this.disk = disk;
        this.graphicAdapter = graphicAdapter;
        this.motherBoard = motherBoard;
    }

    public PowerSupply1 getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply1 powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Disk1 getDisk() {
        return disk;
    }

    public void setDisk(Disk1 disk) {
        this.disk = disk;
    }

    public GraphicAdapter1 getGraphicAdapter() {
        return graphicAdapter;
    }

    public void setGraphicAdapter(GraphicAdapter1 graphicAdapter) {
        this.graphicAdapter = graphicAdapter;
    }

    public MotherBoard1 getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard1 motherBoard) {
        this.motherBoard = motherBoard;
    }

    @Override
    public String toString() {
        return "SystemBlock: " +
                powerSupply + ", " + disk + ", " + graphicAdapter + ", " +
                motherBoard;
    }


}
