package hw11;

public class Computer {
    private String mouse;
    private String keyboard;
    private  String systemBlock;
    private String monitors;

    public Computer(String mouse, String keyboard, String systemBlock, String monitors) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.systemBlock = systemBlock;
        this.monitors = monitors;
    }

    public String getMouse() {
        return mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getSystemBlock() {
        return systemBlock;
    }

    public String getMonitors() {
        return monitors;
    }
}

