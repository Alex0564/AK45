package homework12ab;

public class prokaryoticCell implements IBacteriaCell{
    private String bacteria;
    private String archaea;

    public prokaryoticCell(String bacteria, String archaea) {
        this.bacteria = bacteria;
        this.archaea = archaea;
    }

    @Override
    public void bacteria() {
        System.out.println("Prokaryotic cells are normally smaller than eukaryotic cells.");
    }

    @Override
    public void archaea() {
        System.out.println("Archaea, any of a group of single-celled prokaryotic organisms");

    }
}
