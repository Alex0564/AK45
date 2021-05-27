package myInterview;

import java.util.Random;

public class App1 {
    public static void main(String[] args) {
//        игральные кубики
//        перва функция - н случайных бросков сассив выпавших чисел от 1 до 6
//        вторая функция - сколко раз надо перевернуть все кубики что бы сверху были числа 6
//        дла 6 - 0, для 1 - 2, для остальных - 0
        int[]dices = getRandomDices(5);
        int count = 0;
        for (int dice: dices) {
            System.out.println(dice);
            if (dice == 1) {
                count = count + 2;
                continue;
            }
            if (dice != 6) {
                count++;
                continue;
            }
        }
        System.out.println("count= "+count);
    }
    public static int[] getRandomDices(int n){
        int[] dices = new int[n];
        Random random = new Random();
        for (int i=0;i<n;i++){
            dices[i]=random.nextInt(6)+1;
        }
        return dices;

    }
}
