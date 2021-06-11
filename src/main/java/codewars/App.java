package codewars;

public class App {
    public static void main(String[] args) {
//        Дано три различных по значению числовые величины.
//        Если величины расположены в порядке возрастания,
//        удвойте каждую величину, иначе присвойте каждой
//        величине противоположное значение.
//                Напишите функцию с именем newValues,
//                которая принимает три различных числа
//                a, b, c в качестве аргументов и возвращает
//                измененные значения в виде массива [a, b, c].
//        Примеры:
//        функция newValues(5, 6, 7) должна возвратить [10, 12, 14];
//        функция newValues(3, 0, -1) должна возвратить [-3, 0, 1];
//        функция newValues(-1, -2, 5) должна возвратить [1, 2, -5]].
//        function newValues(a, b, c){
//            if (b>=a&&b<=c) {return [a*2,b*2,c*2];} return [-a,-b,-c];}
        int[] arr = new int[3];
        arr = newValues(2, 14, 6);

        System.out.println("a= " + arr[0]);
        System.out.println("b= " + arr[1]);
        System.out.println("c= " + arr[2]);


    }
           public static int[] newValues (int a, int b, int c) {
               int[] re = new int[3];
               if (b >= a && b <= c) {
                   re = new int[]{a * 2, b * 2, c * 2};
               } else {
                   re = new int[]{-a, -b, -c};
               }
               return re;
           }

}
