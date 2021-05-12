package extraLesson;

import java.util.Arrays;

public class App1 {
    public static void main(String[] args) {
        Person anna = new Person("Anna","Miller",1998);

        System.out.println(anna);

        int[]numbers = {5,2,8,-5};
//        System.out.println(numbers);
//        for (int v:numbers){
//            System.out.println(v);
//        }
        Size[]chart = {Size.S,Size.L,Size.S,Size.M};
//        System.out.println(chart); // Array can't be printed

       //print out through iteration using loop:
        for (Size s :chart){
            System.out.println(s);
        }
        //print out using toString method in Array class:

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(chart));

        Person a = new Student("Alan","Leiden",1999,"Math");
        a.hello();
    }
}
