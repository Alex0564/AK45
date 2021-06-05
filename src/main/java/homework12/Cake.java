package homework12;

public class Cake extends Pancakes{
    private double cacao;

    public Cake(double flour, double sugar, int eggs, double cacao) {
        super(flour,sugar,eggs);
        this.cacao = cacao;
    }

    @Override
    public void bake() {
        System.out.println("I am baking "+(eggs/5)+" chocolate cake(s) on birthday party.");
    }

    @Override
    public double getWeight() {
        return (flour+sugar+(eggs*0.05)+cacao);
    }
}
