package hw13;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<String> subcars = new ArrayList<>();

        subcars.add("Ford");
        subcars.add("GMC");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Lada");
        cars.add("Tesla");
        System.out.println(cars);


        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(7);
        numbers.add(9);
        numbers.add(125);
        System.out.println(numbers);

        ArrayList<String> celebrities = new ArrayList<String>();
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
        numbers.get(3);
        System.out.println(numbers);
        String oldValue = celebrities.set(0, "Niccolo Machiavelli");
        System.out.println(oldValue);
        System.out.println(celebrities);

        cars.addAll(subcars);
        System.out.println(cars);

        for (String car : cars) {
            System.out.println(car);
        }

    }

    }

