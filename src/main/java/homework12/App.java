package homework12;

public class App {
    public static void main(String[] args) {
        Pancakes pancakesForMe = new Pancakes(0.1,0.05,1);
        Pancakes pancakesForFamily = new Pancakes(0.3,0.15,3);
        Cake cake = new Cake(0.15,0.2,5,0.05);
        Cake twoCakes = new Cake(0.3,0.4,10,0.1);
        pancakesForMe.bake();
        System.out.println("Total weight is "+pancakesForMe.getWeight()+" kilos");
        pancakesForFamily.bake();
        System.out.println("Total weight is "+pancakesForFamily.getWeight()+" kilos");
        cake.bake();
        System.out.println("Total weight is "+cake.getWeight()+" kilos");
        twoCakes.bake();
        System.out.println("Total weight is "+twoCakes.getWeight()+" kilos");
    }
}
