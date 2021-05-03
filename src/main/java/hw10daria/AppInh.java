package hw10daria;

public class AppInh {
    public static void main (String []args){
        Animal wolf = new Animal("Wolf", "Grey", "Medium", "Land");
        System.out.println (wolf.getEnvironment());
        System.out.println (wolf.getName());
        System.out.println (wolf.getColor());

        Seaworld fish = new Seaworld("Shrimp", "Grey", "Small", "Water");
        System.out.println (fish.getName());
        System.out.println (fish.getColor());

        Bugs ladybug = new Bugs("Ladybug", "Black with red", "Small", "Land", "Wings");
        System.out.println (ladybug.getWings());

        wolf.setFur("Fluffy");
        System.out.println (wolf.getFur());

        Seaweed nori = new Seaweed("Nori", "Green", "Small", "Water");
        System.out.println (nori.getName());

    }

}
