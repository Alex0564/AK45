package less13homework;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> flowers = new ArrayList<>();
        flowers.add("Tulip");
        flowers.add(1, "Rose");
        for (int i=1; i<4; i++){
            flowers.add(1, "Camomile");
        }
//        System.out.println(flowers);
        flowers.set(2,"Gladiolus");
        flowers.remove("Camomile");
//        System.out.println(flowers);
        System.out.println("There are " + flowers.size() + " flowers:");
//        System.out.println(flowers.get(3));
        for (String i: flowers) {
            System.out.println(i);
        }

        List<Integer> numberOfHouse= new ArrayList<>();
        numberOfHouse.add(1023);
        int [] numbers = {345, 2096, 23, 607};
        for (int i = 0; i<=3; i++){numberOfHouse.add(numbers[i]);}
        numberOfHouse.add(0,numbers[1]);
//        System.out.println(numberOfHouse);
        numberOfHouse.remove(5);
        int length = numberOfHouse.size();
        System.out.println("\nThere are "+length+" houses:");
        System.out.println(numberOfHouse);


        List<Brand> companies = new ArrayList<>();
        Brand apple = new Brand("Apple");
        companies.add(apple);
        companies.add(new Brand("Samsung"));
//        int length1 = companies.size();
//        System.out.println("Length = " + length1);
        String[] newBrand = {"Huawei", "Xiaomi"};
        companies.add(new Brand(newBrand[0]));
        companies.add(new Brand(newBrand[1]));
//        for (int i = 0; i <= 2; i++) {
////            companies.add(new Brand(newBrand[i]));
//            System.out.println(companies.get(i).getName());
//        }
        int length2 = companies.size();
        System.out.println("\nNumber of brands are " + length2);
//        System.out.println(companies.get(0).getName());
        for (int name = 0; name<=3;name++){
            System.out.println(companies.get(name).getName());
        }


    }
}
