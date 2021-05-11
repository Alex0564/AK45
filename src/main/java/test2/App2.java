package test2;

public class App2 {
    public static void main(String[] args) {
        int[]arr1={5,6,7,8,9,};
        int max=max(arr1);
        System.out.println("Max= "+max);


    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int numb : arr) {
            if (numb > max) {
                max = numb;
            }
        }
        return  max;

    }



}


