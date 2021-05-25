package hmLife;

public class Carnivores implements IMammals{
    @Override
    public void canEat(){
        System.out.println("We eat meat!");
    }

    @Override
    public void canHunt() {

    }

    @Override
    public void canBite() {

    }

    @Override
    public void canJump() {

    }

    @Override
    public void weArewarmBlooded() {
        System.out.println("We have warm blood.");
    }

    @Override
    public void weHaveSpine() {

    }
}
