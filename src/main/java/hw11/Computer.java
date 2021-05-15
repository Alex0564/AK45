package hw11;


public class Computer {
    private Mouse mouse;
    private Keyboard keyboard;
    private SystemBlock systemBlock;
    private Monitor monitor;

    //getters
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

    //setters

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    //full constructor
    public Computer(Mouse mouse, Keyboard keyboard, SystemBlock systemBlock, Monitor monitor) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.systemBlock = systemBlock;
        this.monitor = monitor;
    }
}
