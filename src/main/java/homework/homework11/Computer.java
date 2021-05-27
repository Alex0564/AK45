package homework.homework11;


public class Computer {
    private Mouse mouse;
    private Keyboard keyboard;
    private SystemBlock systemBlock;
//    private Monitor[] monitors;
    private Monitor monitor;

    public Computer(Mouse mouse, Keyboard keyboard, SystemBlock systemBlock, Monitor monitor) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.systemBlock = systemBlock;
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
