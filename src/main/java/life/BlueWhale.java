package life;

public class BlueWhale extends Whales{
    private String subspecies;

    public BlueWhale(int weight, String subspecies) {
        super(weight);
        this.subspecies = subspecies;
    }

    public String getSubspecies() {
        return subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }
    public void printBlueWale(){
        System.out.println(weight + ", " + subspecies);
    }
}
