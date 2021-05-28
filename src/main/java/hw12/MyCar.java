package hw12;
public class MyCar implements IJapaneseCar {
    private String brand;
    private String model;

    public MyCar(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }


    @Override
    public void japaneseCar() {
        System.out.println("For Japanese market ");

    }

    @Override
    public int wheels() {
        return 4;
    }
}

