package ArtuomLesson13HW;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
    List<String> car= new ArrayList<>();
    car.add("Toyota");
    car.add("BMW");
    car.add("Volkswagen");
    car.add("Lexus");
        System.out.println(car);
        System.out.println(car.get(3));
        System.out.println(car.get(2));
        System.out.println(car.get(1));
        System.out.println(car.get(0));
        System.out.println(car.size());

        System.out.println("========================1===================");
    car.set(3,"Bugatti");
    car.set(2,"Chevrolet");
        System.out.println(car);
    String oldValue= car.set(1,"Honda");
        System.out.println(oldValue);
        System.out.println(car);

        System.out.println("===============add4cars================");
    car.add("BMW");
    car.add("Linkoln");
    car.add("BMW");
    car.add("Honda");
        System.out.println(car);


        System.out.println("===============REPLACE HONDA-MAZDA================");
    car.set(1,"Mazda");
        System.out.println(car);

    car.add(2,"Linkoln");
        System.out.println(car);
    car.remove(2);
    car.remove("BMW");

        System.out.println(car);

        System.out.println("================1th type Iteration=================");

        for (String model:car ) {
        System.out.println(model);}




        System.out.println("================2th type Iteration=================");

        for(int i=0;i<car.size();i++){
            System.out.println(car.get(i));



    }


    }




}
