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
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Nice to meet you "+name);
        System.out.print("How old are you, "+name+"?");
        int age =scanner.nextInt();
        String WhoOlder = age>myAge? "Oh "+name+", looks you are older than me": "Hey!  "+name+", you're younger than me! Good!!!";
        System.out.println(WhoOlder);

    }
}
