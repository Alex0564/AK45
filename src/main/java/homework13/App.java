package homework13;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> vitamins = new ArrayList<>();
        ArrayList<String> minerals = new ArrayList<>();
        minerals.add("Zink");
        minerals.add(1,"Magnezium");
        vitamins.add("A");
        vitamins.add("D3");
        vitamins.set(1,"B12");
        vitamins.addAll(minerals);
        System.out.println("String ArrayList: "+vitamins);

        ArrayList<Integer> powerBall = new ArrayList<>();
        powerBall.add(7);
        powerBall.add(53);
        powerBall.add(34);
        powerBall.add(2,61);
        powerBall.set(1,9);
        powerBall.add(34);
        for (int i=0; i<powerBall.size();i++){
            if (powerBall.get(i)==34){
                powerBall.set(i,35);
            }
        }
        System.out.println("Integer ArrayList: "+powerBall);

        ArrayList<Boolean> mathExam = new ArrayList<>();
        mathExam.add(3+2*2==6);
        mathExam.add(7-5+3<=10/2);
        mathExam.add(9!=4+5);
        mathExam.add(5+3==3+5);
        mathExam.remove(1);
        System.out.println("Boolean ArrayList: "+mathExam);



    }
}
