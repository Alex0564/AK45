package homework14op;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class App4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Peach");
        fruits.add("Plum");

        Iterator<String> it = fruits.iterator();
//        System.out.println(it.next());

        while (it.hasNext()){
            System.out.println(it.next());
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add (56);
        numbers.add(134);
        numbers.add(89);
        numbers.add(256);

        Iterator<Integer> x = numbers.iterator();
        while (x.hasNext()) {
            Integer i = x.next();
            if(i<120) {
                x.remove();
            }
        }
        System.out.println(numbers);

    }

}
