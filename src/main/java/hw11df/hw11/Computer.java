package hw11df.hw11;


import java.util.Arrays;

public class Computer {
    private Mouse mouse;
    private Keyboard keyboard;
    private SystemBlock systemBlock;
    private Monitor[] monitors;

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

    @Override
    public String toString() {
        return "Computer{" +
                "mouse=" + mouse +
                ", keyboard=" + keyboard +
                ", systemBlock=" + systemBlock +
                ", monitors=" + Arrays.toString(monitors) +
                '}';
    }

    public Computer(Mouse mouse, Keyboard keyboard, SystemBlock systemBlock, Monitor[] monitors) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.systemBlock = systemBlock;
        this.monitors = monitors;

}
}
