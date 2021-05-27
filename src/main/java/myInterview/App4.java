package myInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App4 {
    public static void main(String[] args) {
//        найди повторяющиесяцифры в массиве
        Integer[] arr = {1, 0, 3, 6, 2, 7, 1, 8, 1, 5, 7, 9, 0, 1, 0 };
        for (int a: arr){System.out.println(a);}
        System.out.println("+++++++++++++++++++");
//        надо использовать Set
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        for (int s: set){System.out.println(s);}
        System.out.println("_____________________");
        for (int v : set) {
            int count = 0;
            for (int n : arr) {
                if (n == v) {count++;}
            }
            if (count > 1) {
                System.out.println(" v = " + v);

            }
        }
    }
}