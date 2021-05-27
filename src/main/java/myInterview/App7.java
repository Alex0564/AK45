package myInterview;

public class App7 {
    public static void main(String[] args) {
//        напечатать числа фибоначчи
//        придумать генератор случайных чисел без специальной функции -
//        использовать функцию текущего времени


//        long x =  System.currentTimeMillis();
//        int y = (int) x;
//        double z = x;
//        System.out.println(x);
//        System.out.println(y)
//        System.out.println(z);
//        int rand = (int) (x%100);
        for (int i=1;i<=10;i++){
            long a = System.currentTimeMillis();
            int rand = (int) (a%100);
            System.out.println(a);
            System.out.println(rand);
        }


    }
}
