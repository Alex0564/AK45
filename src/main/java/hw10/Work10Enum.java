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


    }
}
