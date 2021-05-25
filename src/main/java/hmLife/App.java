package hmLife;

public class App {
    public static void main(String[] args){
        Lion kingLine = new Lion();
        kingLine.canBite();

        Wolf wolf = new Wolf();
        wolf.canHunt();

        Primates primats = new Primates();
        primats.canJump();

        Carnivores carnivores = new Carnivores();
        carnivores.weArewarmBlooded();

        Rodents rodents = new Rodents();
        rodents.canBite();

        Seals seals = new Seals();
        seals.canEat();







    }
}
