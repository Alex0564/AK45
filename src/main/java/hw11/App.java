package hw11;

public class App {
    public static void main(String[] args) {
        // Create 2 computers
        // Get CPU Brand from computer

        CPU Intel= new CPU("Intel Core","i5-1035g1");
        CPU Intel2=new CPU ("Intel Core", "I7");

        RAM ddr4=new RAM("Samsung","DDR4",16);
        RAM ddr3=new RAM("Philips","ddr3",16);


        Disk sdd =new Disk("Crucial","P1 3D Nand",500);
        Disk sdd2=new Disk("Western","WDS768T1D0D 2.5",500);


        MotherBoard HP17by3=new MotherBoard("HP Laptop ","17-by3xxx",Intel,ddr4);
        MotherBoard Hp17by4=new MotherBoard("HP Laptop", "17-by4xxx",Intel2,ddr3);

        GraphicAdapter Vid1=new GraphicAdapter("Intel","UHD 620 Graphics");
        GraphicAdapter Vid2= new GraphicAdapter("Intel","UHD 620 Graphics1");

        PowerSupply HP1=new PowerSupply("Hewlett-Packard","609951-0");
        PowerSupply HP2=new PowerSupply("Hewlett-Packard","609951-0");


        SystemBlock HPac1=new SystemBlock(HP1,sdd,Vid1,HP17by3);
        SystemBlock Hpac2=new SystemBlock(HP2,sdd2,Vid2,Hp17by4);

        Keyboard keyb1=new Keyboard("HP","Aluminium");
        Keyboard keyb2=new Keyboard("HP","Black");

        Mouse Log=new Mouse("Logitech","135","Laser", "Black");
        Mouse HPmouse=new Mouse("HP","175","laser","Wareless");

        Monitor Hp=new Monitor("Asus","345",17);
        Monitor Samsung=new Monitor("Samsung","Z658",24);
        Monitor HPmon=new Monitor("HP", "178",17);
//===========================================Practic====================================================//
         String mycomp="Hp";
          String mycomp1="Samsung";
          String x=mycomp;
          String y=mycomp1;
          String T=x+" "+y;


        System.out.println(x);
        System.out.println(y);
        System.out.println(T);


        String [] Monitor= {x,y};
        String v=Monitor[0];
        String w=Monitor[1];
        System.out.println(v+" "+w);
        String d=w;


        System.out.println(Monitor[1]);


        Computer HPArt=new Computer(Log,keyb1, HPac1,Hp);
        Computer HPVer=new Computer(HPmouse,keyb2,Hpac2,HPmon);


//======================================Model CPU==============================================
        String CPUArt=HPArt.getSystemBlock().getMotherBoard().getCpu().getModel();
        System.out.println("Procesor from my Laptop- "+CPUArt);

        String CPUVer=HPVer.getSystemBlock().getMotherBoard().getCpu().getModel();
        System.out.println("Procesor from 2th laptop- " +CPUVer);

//=====================================Model GrAdap=============================================


        String GrAdapArt=HPArt.getSystemBlock().getGraphicAdapter().getModel();
        System.out.println(GrAdapArt);


         String GrAdapVer=HPVer.getSystemBlock().getGraphicAdapter().getModel();
        System.out.println(GrAdapVer);


//=======================================Model Keyboard============================================
        String keyboard=HPArt.getKeyboard().getModel();
        System.out.println(keyboard);

        String keyboard2=HPVer.getKeyboard().getModel();
        System.out.println(keyboard2);


//========================================Model MB=================================================
        String MBArt=HPArt.getSystemBlock().getMotherBoard().getModel();
        System.out.println(MBArt);

        String MBVer=HPVer.getSystemBlock().getMotherBoard().getModel();
        System.out.println(MBVer);







    }


}
