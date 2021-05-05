package homework11;

import java.util.Arrays;

public class Monitor {
    private Monitors1 [] myMonitors1s;
    private String model;
     private int diagonal;

    public Monitor(Monitors1[] myMonitors1s, String model, int diagonal) {
        this.myMonitors1s = myMonitors1s;
        this.model = model;
        this.diagonal = diagonal;
    }

    public Monitors1[] getMyMonitors1s() {
        return myMonitors1s;
    }

    public void setMyMonitors1s(Monitors1[] myMonitors1s) {
        this.myMonitors1s = myMonitors1s;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }


    public void print_Info() {
      System.out.println("Monitor:" +
                "myMonitors1s:" + Arrays.toString(myMonitors1s) +
                ", model:" + model + '\'' +
                ", diagonal:" + diagonal);
    }
}






