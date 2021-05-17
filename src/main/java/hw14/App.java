package hw14;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String,String> playgrounds = new HashMap<>();
        playgrounds.put("Sunny Hill","Naperville");
        playgrounds.put("Little rock","Lisle");
        playgrounds.put("Country Lake","Aurora");
        playgrounds.put("Nike Park","Warrenville");
        System.out.println(playgrounds);
        playgrounds.replace("Sunny Hill","Laguna Beach");
        System.out.println(playgrounds);
        playgrounds.remove("Little rock","Lisle");
        System.out.println(playgrounds);
        System.out.println(playgrounds.get("Country Lake"));
        System.out.println(playgrounds.get("Nike Park"));

        for (String playground: playgrounds.keySet()) {
            System.out.println(playground);
        }
        for (String city: playgrounds.values()) {
            System.out.println(city);
        }
        for (Map.Entry<String,String> entry: playgrounds.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


        Map<Integer, String> address = new HashMap<>();
        address.put(60563,"Fairway Drive");
        address.put(50732,"Scott Street");
        address.put(68347,"Stonebridge Circle");
        address.put(37848,"River Road");
        for (Integer addresses: address.keySet()) {
            System.out.println(addresses);
        }
        for (String addresss: address.values()) {
            System.out.println(addresss);
        }
        address.remove(60563,"Fairway Drive");
            System.out.println(address);
        address.replace(50732,"Adam Street");
            System.out.println(address);
        System.out.println(address.get(68347));
        System.out.println(address.get(37848));
        for (Map.Entry <Integer,String> entry: address.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());

        }


        Map<Person,Information> customers = new HashMap<>();
        customers.put(new Person("Nick","Brown"),new Information("54368, Rock Street","236-87-6985"));
        customers.put(new Person("Stacy","Ivanova"),new Information("60548, Stonebridge Circle","658-96-8988"));
        customers.put(new Person("Jack","Robertson"),new Information("36548, Lasly Road","652-87-3356"));
        customers.put(new Person("Adam","Lamber"),new Information("84967, Fox Volly Plaza","345-96-8648"));
        System.out.println(customers);

        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Strawberry");
        fruits.add("Banana");
        System.out.println(fruits);
        fruits.remove("Strawberry");
        System.out.println(fruits);

        for (String fruit: fruits){
            System.out.println(fruit);
        }

      }
        }


