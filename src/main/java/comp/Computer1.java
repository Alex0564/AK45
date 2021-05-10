package comp;

import java.util.Arrays;

public class Computer1 {
    private Mouse1 mouse;
    private Keyboard1 keyboard;
    private SystemBlock1 systemBlock;
    private Monitor1[] monitors;

    public Computer1(Mouse1 mouse, Keyboard1 keyboard, SystemBlock1 systemBlock, Monitor1[] monitors) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.systemBlock = systemBlock;
        this.monitors = monitors;
    }

    public Computer1() {}


    public Mouse1 getMouse() {
        return mouse;
    }

    public void setMouse(Mouse1 mouse) {
        this.mouse = mouse;
    }

    public Keyboard1 getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard1 keyboard) {
        this.keyboard = keyboard;
    }

    public SystemBlock1 getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock1 systemBlock) {
        this.systemBlock = systemBlock;
    }

    public Monitor1[] getMonitors() {
        return monitors;
    }

    public void setMonitors(Monitor1[] monitors) {
        this.monitors = monitors;
    }

    @Override
    public String toString() {
        return "Computer: " + "\n" + mouse + "\n" +
                keyboard + "\n" + systemBlock +
                "\nMonitors = " + Arrays.toString(monitors);
    }


}
