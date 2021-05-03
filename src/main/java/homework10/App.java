package homework10;

public class App {
    public static void main (String[]args) {

        LinearEquations lEq = new LinearEquations(2, 4);
        System.out.println (lEq.getLinearEq());

        PolinomialEquations pEq = new PolinomialEquations(-5, 6, 7, TypesOfEquations.QUADRATIC);
        System.out.println (pEq.getPolinomEq());
        System.out.println(pEq.getType());


        QuarticEquations qrt = new QuarticEquations(-2, 3, 5, 6, 7, TypesOfEquations.POLINOMIAL);
        System.out.println(qrt.getQEq()+" This is "+qrt.getType()+" equation");




    }
}
