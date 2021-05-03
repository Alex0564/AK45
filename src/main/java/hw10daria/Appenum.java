package hw10daria;

import lesson10.Subjects;

public class Appenum {
    public static void main (String []args) {
        Movies toys = new Movies("Toys", "USA");

        kind[]toyskind = {kind.comedy, kind.drama, kind.western, kind.horror, kind.thriller};
        toys.setKind(toyskind);
        System.out.println(toys.getKind());
    }

}