package lesson11a;

public class SystemBlock {
    private PowerSupply powerSupply;
    private Disk disk;
    private GraphicAdapter graphicAdapter;
    private MotherBoard motherBoard;


    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Disk getDick() {
        return disk;
    }

    public void setDick(Disk dick) {
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

    public SystemBlock(PowerSupply powerSupply, Disk disk, GraphicAdapter graphicAdapter, MotherBoard motherBoard) {
        this.powerSupply = powerSupply;
        this.disk = disk;
        this.graphicAdapter = graphicAdapter;
        this.motherBoard = motherBoard;
    }
}
