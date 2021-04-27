package hw7;

public class HomeWork6 {
    public static void main(String[] args){
        int[] arr={3,9,1,8,4,8,5};
        int y = min(arr);
        System.out.println(y);
        int x=max(arr);
       System.out.print(x);
    }
       public static int max(int[] arr){
     int max = arr[0];
     for (int number: arr){
            if(number>max){
               max=number;
           }
       }
       return max; }
    public static int min(int[] arr){
        int min = arr[0];
        for (int number: arr){
            if(number<min){
                min=number;
            }
        }
        return min;
    }

}

