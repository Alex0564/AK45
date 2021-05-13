package hw17;

public class Lion extends Carnivores{
    private String lionsType;

    public String getLionsType() {
        return lionsType;
    }

    public void setLionsType(String lionsType) {
        this.lionsType = lionsType;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "Carnivores' type='" + type + '\'' +
                ", lionsType='" + lionsType + '\'' +
                '}';
    }

    public Lion(String type, String lionsType) {
        super(type);
        this.lionsType = lionsType;

    }

    public void breath(){
        System.out.println("I can breath!!!");

    }

}
