package homework11;

public class SystemBlock {
    public Object getMotherBoard;
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

    public SystemBlock(Disk newDisk, MotherBoard myMotherBoard, GraphicAdapter myAdapter) {
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

    public GraphicAdapter getGraphicAdapter() {
        return graphicAdapter;
    }

    public void setGraphicAdapter(GraphicAdapter graphicAdapter) {
        this.graphicAdapter = graphicAdapter;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }
}