package hw13;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        List<String> subcars = new ArrayList<>();

        subcars.add("Ford");
        subcars.add("GMC");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Lada");
        cars.add("Tesla");
        System.out.println(cars);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(7);
        numbers.add(9);
        numbers.add(125);
        System.out.println(numbers);

        List<String> celebrities = new ArrayList<>();
        celebrities.add("Justin Timberlake");
        celebrities.add("Alla Pugacheva");
        celebrities.add("Nadejda Kadesheva");
        celebrities.add("Donald Trump");
        System.out.println(celebrities);

        cars.set(1, "KIA");
        System.out.println(cars);

        celebrities.add(1, "ME");
        System.out.println(celebrities);
        celebrities.remove(1);
        System.out.println(celebrities);
        System.out.println(numbers);
        String oldValue = celebrities.set(0, "Niccolo Machiavelli");
        System.out.println(oldValue);
        System.out.println(celebrities);

        cars.addAll(subcars);
        System.out.println(cars);

        for (String car : cars) {
            System.out.println(car);
        }

        Car car = new Car("BMW", "Red", 2021);
        Car car1 = new Car("Toyota", "Yellow", 2020);
        Car car2 = new Car("Lada", "Chery color", 1989);
        Car car3 = new Car("Tesla", "White", 2019);
        Car car4 = new Car("Ford", "Navy", 2018);
        Car car5 = new Car("GMC", "Orange", 2000);

        List<Car> cars1 = new ArrayList<>();
        cars1.add(car);
        cars1.add(car1);
        cars1.add(car2);
        cars1.add(car3);
        cars1.add(car4);
        cars1.add(car5);

        for (Car c : cars1) {
            System.out.println(c);
        }

        for (Car c : cars1) {
            System.out.println(c.getColor());
        }
        for (Car c : cars1) {
            System.out.println(c.getColor());

        }

        Celebrities celeb = new Celebrities("Justin Timberlake", 32, "Male", "Singer");
        Celebrities celeb1 = new Celebrities("Alla Pugacheva", 80, "Female", "Primadona");
        Celebrities celeb2 = new Celebrities("Nadejda Kadusheva", 60, "Female", "Folk singer");
        Celebrities celeb3 = new Celebrities("Donald Trump", 72, "Male", "Polotician");

        List<Celebrities> celebrities1 = new ArrayList<>();
        celebrities1.add(celeb);
        celebrities1.add(celeb1);
        celebrities1.add(celeb2);
        celebrities1.add(celeb3);

        for (Celebrities c1 : celebrities1) {
            System.out.println(c1);
        }
            for (Celebrities c1 : celebrities1) {
                System.out.println(c1.getAge());

        }
            celeb2.setAge(25);
        System.out.println(celeb2.getAge());
        celeb3.setCareer("XPresident");
        System.out.println(celeb3.getCareer());



        }


    }























