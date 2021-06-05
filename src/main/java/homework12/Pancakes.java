package homework12;

public class Pancakes implements IBake{
    protected double flour;
    protected double sugar;
    protected int eggs;

    public Pancakes(double flour, double sugar, int eggs) {
        this.flour = flour;
        this.sugar = sugar;
        this.eggs = eggs;
    }

    @Override
    public void bake() {
        System.out.println("I'm making "+eggs*3+" pancakes on breakfast.");//1 egg is average on 3 pancakes
    }

    @Override
    public double getWeight() {
        return (flour+sugar+eggs*0.05); //0.05 average weight of egg in kilos
    }
}
