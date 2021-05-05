package homework13;

import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        ArrayList<String>books = new ArrayList<>();
        ArrayList<String>magazines = new ArrayList<>();
       magazines.add("#1");
       magazines.add("#3");
       books.add("a");
       books.add("d");
       books.set(1,"p");
       books.addAll(magazines);
       System.out.println("String Arrylist: "+books);

       ArrayList<Integer> sportGame = new ArrayList<>();
       sportGame.add(8);
       sportGame.add(15);
       sportGame.add(33);
       sportGame.add(2);
       sportGame.set(1,5);
       sportGame.add(15);
       for (int i=0; i<sportGame.size(); i++){
           if (sportGame.get(i)==15){
               sportGame.set(i,15);

           }
       }
       System.out.println("Integer ArrayList: "+sportGame);


       ArrayList<Boolean> test = new ArrayList<>();
       test.add(1+2*3==5);
       test.add(9-3-1<=12/2);
       test.add(8!=6+2);
       test.add(1+3==2+2);
       test.remove(3);

       System.out.println("Boolean ArrayList:"+test);






    }
}
