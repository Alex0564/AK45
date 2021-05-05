package HW13;

import java.util.ArrayList;

public class AppInteger {
    public static void main(String[] args) {
        ArrayList<Integer> usElectionYears = new ArrayList<>();
        usElectionYears.add(2024);
        usElectionYears.add(2020);
        usElectionYears.add(2016);
        usElectionYears.add(2012);
        usElectionYears.add(2010);
        usElectionYears.remove(4);
        usElectionYears.add(2009);
        usElectionYears.set(4, 2008);

        for (int years:usElectionYears){
            System.out.println(years);
        }

        System.out.println(usElectionYears.get(0));



    }
}
