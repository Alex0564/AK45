package homework10;

public class LinearEquations extends Coefficients{
    private String linearEq;


    public LinearEquations (int a, int b)
    {
        super (a, b);
        this.linearEq = linearEq;


    }


    public String getLinearEq() {
        return "Linear Equation: y= " +a+"*x+"+b;
    }


}
