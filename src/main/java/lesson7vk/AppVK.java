package lesson7vk;

import java.util.Scanner;

public class AppVK {
    public static void main(String[] args) {
        System.out.println("Hello my friend!");
        myDialog();
    }
    public static void myDialog(){
        int myAge=43;
        System.out.println("Hello my friend! Let's introduce to each other!");
        System.out.print("What is your name?:");
        //here we create new object scanner of Scanner from java.util
        Scanner scanner = new Scanner(System.in);

        //create var 'name' to store input stream value String type
        String name = scanner.nextLine();
        System.out.println("Nice to meet you "+name);
        System.out.print("How old are you, "+name+"?");

        //create var 'age' to store input stream value integer type
        int age =scanner.nextInt();

        String WhoOlder = age>myAge? "Oh "+name+", looks you are older than me": "Hey!  "+name+", you're younger than me! Good!!!";
        System.out.println(WhoOlder);

    }
}
