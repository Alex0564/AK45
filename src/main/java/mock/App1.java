package mock;

public class App1 {
    //write a func that takes an array of integers and returns the sum of all elements
    //sumArray([1,2,3,4,5]) ->15
    public static void main(String[] args){
        int[] arrayOfInt={1,2,3,4,5};
        System.out.println(sumArray(arrayOfInt));


    }
    public static int sumArray(int[] ar){
        int sum=0;
        for(int v:ar)
        {
            sum+=v;
        }
        return sum;
    }
}
