package hw10daria;

import lesson10.Subjects;

public class Appenum {
    public static void main (String []args) {
        Movies toys = new Movies("Toys", "USA");

        kind[]toyskind = {kind.comedy, kind.drama, kind.western, kind.horror, kind.thriller};
        toys.setKind(toyskind);
        System.out.println(toys.getKind());
        // I am getting this [Lhw10daria.kind;@3f99bd52 (((( and I don't really know why..

}}