package lesson11hw;

public class SystemBlock {
    private PowerSupply powerSupply;
    private Disk disk;
    private GraphicAdapter graphicAdapter;
    private MotherBoard moterBoard;

    public SystemBlock(PowerSupply powerSupply, Disk disk, GraphicAdapter graphicAdapter, MotherBoard moterBoard) {
        this.powerSupply = powerSupply;
        this.disk = disk;
        this.graphicAdapter = graphicAdapter;
        this.moterBoard = moterBoard;
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

    public MotherBoard getMoterBoard() {
        return moterBoard;
    }

    public void setMoterBoard(MotherBoard moterBoard) {
        this.moterBoard = moterBoard;
    }
}
