package homework10;

public class QuarticEquations extends Coefficients{
    private String qEq;
    private int c;
    private int d;
    private int e;
    private TypesOfEquations type;


    public QuarticEquations (int a, int b, int c, int d, int e, TypesOfEquations type){
        super (a, b);
        this.c = c;
        this.d = d;
        this.e = e;
        this.qEq = qEq;
        this.type = type;
    }

    public void setC (int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setD (int d) {
        this.d = d;
    }

    public int getD() {
        return d;
    }

    public void setE (int e) {
        this.e = e;
    }

    public int getE() {
        return e;
    }

    public void setType (TypesOfEquations type) {
        this.type = type;
    }

    public TypesOfEquations getType() {
        return type;
    }
    public String getQEq() {
        return "y= " +a+"*x^4+"+b+"x^3+"+c +"x^2+"+d+"x+"+e;
    }

}
