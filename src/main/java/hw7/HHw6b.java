package hw7;

public class HHw6b {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 9, 1, 8, 4, 8, 5};
        int y = sort(3, 9, 1, 8, 4, 8, 5);
        System.out.print(y);
    }
    public static int sort(int a, int b, int c, int d, int e, int f, int g) {
        int[] arr = new int[]{a, b, c, d, e, f, g};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // I found this methof in the internet, I don't need this last temp (9) in array
        // but I don't know how to use with out return statement
        return temp;
    }
}

