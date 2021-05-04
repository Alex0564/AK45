package hw10;

public class Work10Enum {
    public static void main(String[]args){

        Grill mod1 = new Grill("WEBER","Master-Touch Charcoal Grill 22",Modification.CHARCOAL);
        System.out.println(mod1.getName());
        System.out.println(mod1.getModel());
        System.out.println(mod1.getModification());

        Grill mod2 = new Grill("WEBER","Genesis II SX-335 Smart Grill",Modification.GAS);
        System.out.println(mod2.getName());
        System.out.println(mod2.getModel());
        System.out.println(mod2.getModification());


        Dish pilaf = new Dish("Pilaf");
        Ingredient [] ingredients = {Ingredient.RICE,Ingredient.MEAT,Ingredient.VEGETABLES};
        for (Ingredient Pilaf:ingredients){
            System.out.println(Pilaf);
        }

        Dish pasta = new Dish("Carbonara");
        Ingredient [] ingredients1 = {Ingredient.PASTA,Ingredient.HALF_AND_HALF,Ingredient.SHRIMPS};
        for (Ingredient Pasta:ingredients1){
            System.out.println(Pasta);
        }

    }
}
