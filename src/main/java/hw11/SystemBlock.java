package hw11;

public class SystemBlock {
    private PowerSupply powerSupply;
    private Disk disk;
    private GraphicAdapter graphicAdapter;
    private MotherBoard motherBoard;

    public void setPowerSupply(PowerSupply powerSupply){ this.powerSupply=powerSupply; }
    public PowerSupply getPowerSupply () {return powerSupply; }

    public void setDisk (Disk disk){this.disk=disk;}
    public Disk disk (){return disk;}

    public void setGraphicAdapter(GraphicAdapter graphicAdapter) {this.graphicAdapter=graphicAdapter;}
    public GraphicAdapter getGraphicAdapter() {return  graphicAdapter;}

    public void setMotherBoard (MotherBoard motherBoard) {this.motherBoard=motherBoard;}
    public MotherBoard getMotherBoard(){return motherBoard;}

    public SystemBlock(PowerSupply powerSupply, Disk disk, GraphicAdapter graphicAdapter, MotherBoard motherBoard ){
        this.powerSupply=powerSupply; this.disk=disk; this.graphicAdapter=graphicAdapter; this.motherBoard= motherBoard;}

}
