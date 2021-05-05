package homework11;

import java.util.Arrays;

public class Computer {
    private Mouse mouse;
    private Keyboard keyboard;
    private SystemBlock systemBlock;
    private Monitor[] monitors;

    public Computer(Mouse mouse, Keyboard keyboard, SystemBlock systemBlock, Monitor[] monotors) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.systemBlock = systemBlock;
        this.monitors = monotors;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }

    public Monitor[] getMonitors() {
        return monitors;
    }

    public void setMonitors(Monitor[] monitors) {
        this.monitors = monitors;
    }


    public void print_info() {
       System.out.println("Computer:" +
                "mouse:" + mouse +
                ", keyboard:" + keyboard +
                ", systemBlock:" + systemBlock +
                ", monitors:" + Arrays.toString(monitors));
    }
}
