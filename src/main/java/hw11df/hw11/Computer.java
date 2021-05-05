package hw11df.hw11;


public class Computer {
    private Mouse mouse;
    private Keyboard keyboard;
    private SystemBlock systemBlock;
//    private Monitor[] monitors;
    private Monitor monitor;

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

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Computer(Mouse mouse, Keyboard keyboard, SystemBlock systemBlock, Monitor monitor) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.systemBlock = systemBlock;
        this.monitor = monitor;

    }
}
