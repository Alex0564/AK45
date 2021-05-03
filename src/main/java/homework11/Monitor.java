package homework11;

public class Monitor<myMonitors> {
    public static Monitor[] myMonitor;
    String[]myMonitors1 = {"HP", "ASUS"};
    private String model;
     private int diagonal;

    public Monitor(Monitor[] myMonitors, String model, int diagonal) {
        this.myMonitors1 = myMonitors1;
        this.myMonitor = myMonitors;
        this.model = model;
        this.diagonal = diagonal;
    }

    public Monitor(Object monitors, String hp, int diagonal, Monitor[] myMonitor) {

        Monitor.myMonitor = myMonitor;
    }

    public Monitor[] getMyMonitor() {
        return myMonitor;
    }

    public void setMyMonitor(Monitor[] myMonitor) {
        this.myMonitor = myMonitor;
    }
}






