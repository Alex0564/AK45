package lesson7;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {



    }
    public static void sort(int[] ar){
        int temp; //temp value to replacing
        for(int v:ar) {
            for (int i=0; i<ar.length-1; i++)
            {
                if (ar[i] > ar[i + 1])
                {
                    temp = ar[i + 1];
                    ar[i + 1] = ar[i];
                    ar[i] = temp;
                }
            }
        }
        for(int v:ar){
            System.out.println(v);}

    }

}
