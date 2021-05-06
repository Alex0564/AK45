package HW13;

import java.util.ArrayList;
import java.util.List;

public class AppChart {
    public static void main(String[] args) {
        List<billboard2020> chart =new ArrayList<>();
        chart.add(new billboard2020("The Weeknd", "Blinding Lights", 1));
        chart.add(new billboard2020("Post Malone", "Circles", 2));
        chart.add(new billboard2020("Roddy Ricch", "The Box", 3));
        chart.add(new billboard2020("Dua Lipa", "Don't Start Now", 4));
        chart.add(new billboard2020("Harry Styles", "Adore You", 5));
        chart.set(4, new billboard2020( "DaBaby Featuring Roddy Ricch", "Rockstar", 5 ));

        System.out.println(chart.get(2).getName());
        System.out.println(chart.get(0).getSong());

        for (billboard2020 top5:chart){
            System.out.println(top5.getFullChart());
        }


        }
    }

