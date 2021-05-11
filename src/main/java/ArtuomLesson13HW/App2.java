package ArtuomLesson13HW;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Integer> sum = new ArrayList<Integer>();
        sum.add(2);
        sum.add(4);
        sum.add(8);
        sum.add(16);
        System.out.println(sum);
        System.out.println(sum.get(1));

        sum.set(0, 32);
        sum.set(1, 64);
        sum.set(2, 128);
        sum.set(3, 256);

        System.out.println(sum);
        int oldValue = sum.set(0, 512);
        int oldValue1 = sum.set(1, 1024);
        int oldValue2 = sum.set(2, 2048);
        int oldValue3 = sum.set(3, 4096);

        System.out.println(sum);

        sum.add(8192);
        sum.add(16384);
        sum.add(6, 32728);
        sum.add(7, 65536);
        sum.add(8, 32728);

        System.out.println(sum);


        sum.add(0, 64536);
        sum.add(2, 32728);
        sum.add(4, 16384);
        sum.add(6, 8192);
        System.out.println(sum);


        System.out.println(sum.size());
        sum.remove(0);
        sum.remove(1);
        sum.remove(2);
        sum.remove(3);
        sum.remove(8);

        System.out.println(sum);

        System.out.println("================1th type Iteration=================");

        for (int Amount : sum) {
            System.out.println(Amount);
        }


        System.out.println("================2th type Iteration=================");

        for (int i = 0; i < sum.size(); i++) {
            System.out.println(sum.get(i));


        }

    }
}
