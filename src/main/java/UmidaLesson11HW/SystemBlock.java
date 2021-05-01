package UmidaLesson11HW;

public class SystemBlock {
    private  PowerSupply powerSupply;
    private  Disk disk;
    private GraphicAdapter graphicAdapter;
    private MotherBoard MotherBoard;

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

    public UmidaLesson11HW.MotherBoard getMotherBoard() {
        return MotherBoard;
    }

    public void setMotherBoard(UmidaLesson11HW.MotherBoard motherBoard) {
        MotherBoard = motherBoard;
    }

    public SystemBlock(PowerSupply powerSupply, Disk disk, GraphicAdapter graphicAdapter,
                       MotherBoard motherBoard) {
        this.powerSupply = powerSupply;
        this.disk = disk;
        this.graphicAdapter = graphicAdapter;
        MotherBoard = motherBoard;


    }
}
