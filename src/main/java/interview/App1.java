package interview;

import java.util.Random;

public class App1 {
    public static void main(String[] args) {
        int[] dices = getRandomDices(5);
        int count = 0;
        for (int dice:dices){
            System.out.println(dice);
            if(dice==1) {
                count+= 2;
            }else if(dice!=6){
                count++;
            }
        }
        System.out.println("count = " +count);
    }
    public static int[] getRandomDices(int n){
        int[] dices = new int[n];
        Random random = new Random();
        for (int i=0;i<n;i++){
            dices[i] = random.nextInt(6)+1;
        }
        return dices;
    }
}
