package hw11;

public class SystemBlock {
    private PowerSupply powerSupply;
    private Disk disk;
    private GraphicAdapter graphicAdapter;
    private MotherBoard motherBoard;

    // setters
    public void setPowerSupply (PowerSupply powerSupply){
        this.powerSupply=powerSupply;
    }
    public void setDisk (Disk disk){
        this.disk=disk;
    }
    public void setGraphicAdapter (GraphicAdapter graphicAdapter){
        this.graphicAdapter=graphicAdapter;
    }
    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard=motherBoard;
    }
    //getters
    public PowerSupply getPowerSupply(){
        return powerSupply;
    }
    public Disk disk (){
        return disk;
    }
    public GraphicAdapter getGraphicAdapter(){
        return graphicAdapter;
    }
    public MotherBoard getMotherBoard(){
        return motherBoard;
    }

// full constructor
    public SystemBlock(PowerSupply powerSupply, Disk disk, GraphicAdapter graphicAdapter, MotherBoard motherBoard) {
        this.powerSupply = powerSupply;
        this.disk = disk;
        this.graphicAdapter = graphicAdapter;
        this.motherBoard = motherBoard;
    }


}
