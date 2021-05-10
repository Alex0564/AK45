package hw11;

import java.util.Arrays;

public class Computer {
    private Mouse mouse;
    private Keyboard keyboard;
    private SystemBlock systemBlock;
    private Monitor[] monitor;

    public Computer(Mouse mouse, Keyboard keyboard, SystemBlock systemBlock, Monitor[] monitor) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.systemBlock = systemBlock;
        this.monitor = monitor;
    }


        public Mouse getMouse () {
            return mouse;
        }

        public void setMouse (Mouse mouse){
            this.mouse = mouse;
        }

        public Keyboard getKeyboard () {
            return keyboard;
        }

        public void setKeyboard (Keyboard keyboard){
            this.keyboard = keyboard;
        }

        public SystemBlock getSystemBlock () {
            return systemBlock;
        }

        public void setSystemBlock (SystemBlock systemBlock){
            this.systemBlock = systemBlock;
        }

        public Monitor[] getMonitor () {
            return monitor;
        }

        public void setMonitor (Monitor[]monitors){
            this.monitor = monitors;
        }

    @Override
    public String toString() {
        return "Computer{" +
                "mouse=" + mouse +
                ", keyboard=" + keyboard +
                ", systemBlock=" + systemBlock +
                ", monitor=" + Arrays.toString(monitor) +
                '}';
    }
}





