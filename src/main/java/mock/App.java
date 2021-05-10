package mock;

import java.sql.Array;

public class App {

    //write a func to check if an array contains a particular  number:
    //check([1,2,3,4,5],3) -> true

    public static void main(String[] args) {
        int number = 3;
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println((check(myArray,number)));
        //int[] indeces=new int[];
    }
    public static Boolean check(int[] ar,int num){
        boolean result=true;

        for(int v:ar){
            if (v==num)
            return result;
        }
        return false;
    }
}
