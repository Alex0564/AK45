package homework12a;

import Lesson8a.Fruit;

public class App {
    public static void main(String[] args) {

        Apple thisApple = new Apple("green");

        Apple thatApple = new Apple("yellow");

        Banana thisBanana = new Banana("Africa");

        Banana thatBanana = new Banana("Brazil");

        IFruits [] fruits = {thatApple, thatBanana, thisApple, thisBanana};
        for (IFruits fruits1: fruits){
            fruits1.fruitName();
        }


    }
}
