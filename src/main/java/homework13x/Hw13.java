package homework13x;

import java.util.ArrayList;

public class Hw13 {
    public static void main(String[] args) {
        //1st Array list
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Mars");
        planets.add("Jupiter");
        System.out.println(planets);

        //Method add
        planets.add(0, "Venus");
        System.out.println(planets);

        //Method set
        planets.set(4, "Saturn");
        System.out.println(planets);

        //Method remove
        planets.remove(1);
        System.out.println(planets);
        planets.remove("Mars");
        System.out.println(planets);

        //Method get
        System.out.println(planets.get(0));

        //Method foreach
        for (String planet : planets) {
            System.out.println(planet);
        }


        //2nd ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println(numbers);

        //Method add
        numbers.add(11);
        System.out.println(numbers);

        //Method set
        numbers.set(5, 56);
        System.out.println(numbers);

        //Method remove
        numbers.remove(1);
        System.out.println(numbers);

        //Method get
        System.out.println(numbers.get(0));

        //Method foreach
        for (int v : numbers) {
            System.out.println(v);
        }


        //3rd ArrayList Custom class
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple"));
        fruits.add(new Fruit("Apricot"));
        fruits.add(new Fruit("Orange"));
        fruits.add(new Fruit("Banana"));


        //Method get
        System.out.println(fruits.get(0).getName());

        //Method remove
        System.out.println(fruits.remove(3).getName());

        //Method foreach
        for (Fruit ab : fruits) {
            System.out.println(ab.getName());
        }


    }
}
