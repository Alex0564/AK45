package lesson10hw;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Cat kitty = new Cat("Kitty",Color.TRICOLOR,1,Insurance.YES);
        Cat musya = new Cat();
        musya.setName("Musya");
        musya.setColor(Color.BLACK);
        musya.setYear(1);
        musya.setInsurance(Insurance.NO);

        Dog sherpa = new Dog("Sherpa",Color.GOLD,5,Insurance.YES);
        Dog sky = new Dog();
        sky.setName("Sky");
        sky.setYear(3);
        Color[] skyColor = {Color.BLACK,Color.WHITE};

        Bird parrot = new Bird("Kesha",Color.MULTI,2,Insurance.NO);

        System.out.println("Pet name ="+kitty.getName()+" "+"Insured = " + kitty.getInsurance());
        System.out.println("Pet name = "+sky.getName()+" "+"Color = "+ Arrays.toString(skyColor));
    }
}
