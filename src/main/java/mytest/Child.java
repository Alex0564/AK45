package mytest;

public class Child extends Human {
    private String s;



    public Child( int age, int year, String s) {
        super(age,year);
        this.s = s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
    public void infoChild(){
        System.out.println(s);

    }
}
