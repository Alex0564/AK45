package hw12;

public class App {
    public static void main(String[] args) {
        IJapaneseCar car = new MyCar("Honda","Fit");
        IJapaneseCar suzuki = new MyBike();

        IJapaneseCar[] transport={car,suzuki};
        for (IJapaneseCar tran:transport){
            tran.japaneseCar();

        }
    }
}
