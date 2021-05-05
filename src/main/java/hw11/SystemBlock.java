package hw11;

public class SystemBlock {
    private String powerSupply;
    private String disk;
    private String graphicAdapter;
    private String motherBoard;

    public SystemBlock(String powerSupply, String disk, String graphicAdapter, String motherBoard) {
        this.powerSupply = powerSupply;
        this.disk = disk;
        this.graphicAdapter = graphicAdapter;
        this.motherBoard = motherBoard;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getGraphicAdapter() {
        return graphicAdapter;
    }

    public void setGraphicAdapter(String graphicAdapter) {
        this.graphicAdapter = graphicAdapter;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }
}
