package homework10;

public class PolinomialEquations extends Coefficients{
    private String polinomEq;
    private int c;
    private TypesOfEquations type;


    public PolinomialEquations (int a, int b, int c, TypesOfEquations type){
        super (a, b);
        this.c = c;
        this.polinomEq = polinomEq;
        this.type = type;
    }

    public void setC (int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setType (TypesOfEquations type) {
        this.type = type;
    }

    public TypesOfEquations getType() {
        return type;
    }
    public String getPolinomEq() {
        return "y= " +a+"*x^2+"+b+"x+"+c;
    }

}
