package hw12;

public class MyBike implements IJapaneseCar,ITank{
    @Override
    public void japaneseCar() {
        System.out.println("I'm still for Japan");

    }

    @Override
    public int wheels() {
        return 4;
    }

    @Override
    public void tank() {
        System.out.println("large tank");


    }
}
