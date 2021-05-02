package hw11vk77;

import java.util.Arrays;

public class Computer {
    private Mouse mouse;
    private  Keyboard keyboard;
    private SystemBlock systemBlock;
    //private Monitor monitors;
    private Monitor[] monitorsarray;

//    public Computer(Mouse mouse, Keyboard keyboard, SystemBlock systemBlock, Monitor monitors) {
//        this.mouse = mouse;
//        this.keyboard = keyboard;
//        this.systemBlock = systemBlock;
//        this.monitors = monitors;
//    }


    public Computer(Mouse mouse, Keyboard keyboard, SystemBlock systemBlock, Monitor[] monitorsarray) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.systemBlock = systemBlock;
        this.monitorsarray = monitorsarray;
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

//    public Monitor getMonitors() {
//        return monitors;
//    }


    public Monitor[] getMonitors() {
        return monitorsarray;
    }

    public void getInfo(){
        String cpu, ram,disk;
        String monitor="";
        int amount=0;

        cpu=systemBlock.getMotherBoard().getCpu().getBrand().name()+" - "+systemBlock.getMotherBoard().getCpu().getModel().name();
        ram=systemBlock.getMotherBoard().getRam().getSize().name()+" - "+systemBlock.getMotherBoard().getRam().getModel().name();
        disk=systemBlock.getDisk().getBrand().toString()+"-"+systemBlock.getDisk().getModel().toString()+"/"+systemBlock.getDisk().getSize().toString();
//      monitor=monitors.getBrand().toString()+"-"+monitors.getModel().toString()+"/"+monitors.getDiag()+"''";
        for (Monitor v:monitorsarray){
            amount++;
        monitor=monitor+ "monitor#"+amount+": "+v.getBrand().toString()+"-"+v.getModel().toString()+"/"+v.getDiag()+"'';";}

        System.out.println("==============Program result:=================");
        System.out.println("Computer configuration:");
//        System.out.println("CPU: "+ cpu +" \nRAM: "+ ram +" \nDISK: "+ disk +" \nMONITOR: "+ monitor);
        System.out.println("CPU: "+ cpu +" \nRAM: "+ ram +" \nDISK: "+ disk +" \nMONITOR(s): "+ monitor);
    }

}
