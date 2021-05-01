package homework11op;

public class Computor {
    private Mouse mouse;
    private KeyBoard keyBoard;
    private SystemBlock systemBlock;
    private Monitor [] monitors;

    public Computor(Mouse mouse, KeyBoard keyBoard, SystemBlock systemBlock, Monitor[] monitors) {
        this.mouse = mouse;
        this.keyBoard = keyBoard;
        this.systemBlock = systemBlock;
        this.monitors = monitors;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
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
}
