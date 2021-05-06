package hw11ab;

public class App {
    public static void main(String[]args){
        RAM ram=new RAM("Crucial","2R",2048);
        CPU cpu=new CPU("Intel","I9");

        MotherBoard mb= new MotherBoard("Dell","Super micro",cpu,ram);

        mb.setBrand("Dell");
        mb.setModel("Syper micro");

        System.out.println(mb.getBrand());
        System.out.println(mb.getModel());



    }
}
