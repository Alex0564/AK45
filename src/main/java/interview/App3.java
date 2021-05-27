package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App3 {
    public static void main(String[] args) {
        Integer[] arr = {10,1,2,4,5,8,2,5,10,66,84,55,52,1};
        Set<Integer> set = new HashSet(Arrays.asList(arr));
        for (int v: set){
            int count = 0;
            for (int n: arr){
                if (n==v){
                    count++;
                }
            }
            if (count>1){
                System.out.println(v);
            }
        }
    }
}
