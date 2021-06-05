package homework11;

public class SystemBlock {
    private PowerSupply powerSupply;
    private Disk disk;
    private GraphicAdapter graphicAdapter;
    private MotherBoard motherBoard;

    public SystemBlock(PowerSupply powerSupply, Disk disk, GraphicAdapter graphicAdapter, MotherBoard motherBoard) {
        this.powerSupply = powerSupply;
        this.disk = disk;
        this.graphicAdapter = graphicAdapter;
        this.motherBoard = motherBoard;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public Disk getDisk() {
        return disk;
    }

    public GraphicAdapter getGraphicAdapter() {
        return graphicAdapter;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}