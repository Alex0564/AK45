package hw11;


public class Computer {
    private Mouse mouse;
    private Keyboard keyboard;
    private SystemBlock systemBlock;
//    private Monitor[] monitors;
    private Monitor monitor;

    public Computer (SystemBlock systemBlock, Monitor monitor, Keyboard keyboard, Mouse mouse){
        this.systemBlock = systemBlock;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
    public SystemBlock getSystemBlock(){return systemBlock;}
    public Monitor getMonitor(){return monitor;}
    public Keyboard getKeyboard(){return keyboard;}
    public Mouse getMouse(){return mouse;}


}
