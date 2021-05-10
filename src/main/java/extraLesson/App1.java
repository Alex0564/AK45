package extraLesson;

import java.util.Arrays;

public class App1 {
    public static void main(String[] args) {
        Person anna = new Person("Anna","Miller",1998);

        System.out.println(anna);

        int[]numbers = {1,2,3};
//        System.out.println(numbers);
//        for (int v:numbers){
//            System.out.println(v);
//        }
        Size[]chart = {Size.S,Size.L,Size.S};
//        System.out.println(chart);



//        for (Size s :chart){
//            System.out.println(s);
//        }
        System.out.println(Arrays.toString(numbers));

        Person a = new Student("Alan","Leiden",1999,"Math");
        a.hello();
    }
}
