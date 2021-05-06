package homework12ab;

public class eukaryoticCell implements IHumanCell{
    private String structure;
    private int size;

    public eukaryoticCell(String structure, int size) {
        this.structure = structure;
        this.size = size;
    }

    @Override
    public void DNA() {
        System.out.println("Eukaryotic DNA is larger in size");

    }

    @Override
    public void nucleus() {
        System.out.println("Eukaryotic cells have a true nucleus");
    }
}
