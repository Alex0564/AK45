package hw12;
public class MyCar implements IJapaneseCar{
    private  String brand;
    private String model;

    public MyCar(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
    public void print(String xx){
        System.out.println(brand+" "+model+" "+xx);
    }


    @Override
    public boolean japaneseCar() {
        System.out.println("in Japanese steering wheel should be on right side ");

        return false;
    }

    @Override
    public String SteeringWheel() {
        return "wheel is on right side";
    }
}
