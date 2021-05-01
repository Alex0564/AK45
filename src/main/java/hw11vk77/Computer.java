package hw11vk77;

public class Computer {
    private Mouse mouse;
    private  Keyboard keyboard;
    private SystemBlock systemBlock;
    private Monitor monitors;

    public Computer(Mouse mouse, Keyboard keyboard, SystemBlock systemBlock, Monitor monitors) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.systemBlock = systemBlock;
        this.monitors = monitors;
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

    public Monitor getMonitors() {
        return monitors;
    }
    public void getInfo(){
        String cpu, ram,disk,monitor;
        cpu=systemBlock.getMotherBoard().getCpu().getBrand().name()+" - "+systemBlock.getMotherBoard().getCpu().getModel().name();
        ram=systemBlock.getMotherBoard().getRam().getSize().name()+" - "+systemBlock.getMotherBoard().getRam().getModel().name();
        disk=systemBlock.getDisk().getBrand().toString()+"-"+systemBlock.getDisk().getModel().toString()+"/"+systemBlock.getDisk().getSize().toString();
        monitor=monitors.getBrand().toString()+"-"+monitors.getModel().toString()+"/"+monitors.getDiag()+"''";
        System.out.println("==============Program result:=================");
        System.out.println("Computer configuration:");
        System.out.println("CPU: "+ cpu +" \nRAM: "+ ram +" \nDISK: "+ disk +" \nMONITOR: "+ monitor);
    }

}
