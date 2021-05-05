package hw11df.hw11;

public class App {
    public static void main(String[] args) {
        // Create 2 computers
        // Get CPU Brand from computer
   Mouse a = new Mouse("Logitech","M325");
   Mouse b = new Mouse("Glorious", "O");
   Mouse c= new Mouse("Logitech", "M170");

   Keyboard d =new Keyboard("HP","K15000");
   Keyboard e = new Keyboard("IMicro","KB-IMKS");
   Keyboard f= new Keyboard("Mekkally", "2,4G HSB");

   PowerSupply g= new PowerSupply("Omron","S8VK-G03024");
   PowerSupply h= new PowerSupply("Dell","125");
   PowerSupply i= new PowerSupply( "Dell","NPS 230DB");

   Disk j= new Disk("Dell", "400-ATKL",512);
   Disk k= new Disk("Siagate","9fn066-009",600);
   Disk l=new Disk("HP","581311",600);

   GraphicAdapter m= new GraphicAdapter("Lenovo","Qaudro P5000");
   GraphicAdapter n= new GraphicAdapter("Dell","HJOd3");

   CPU o= new CPU("Intell","BX8070");
   CPU p=new CPU("Intel","i5-520-m");
   CPU q=new CPU("Intell","E7500");

   RAM r=new RAM("Hyper","RGB",64);
   RAM s= new RAM("Kingston ", "2933",64);

   Monitor t=new Monitor("Dell","P2018HE",20);
   Monitor u=new Monitor("HPI","P24",24);
   Monitor v=new Monitor("HP","Home20kd",20);

   MotherBoard w=new MotherBoard("ASSUS","ROG",p,r);
   MotherBoard x=new MotherBoard("ASSUS","Prime",q,s);

   SystemBlock y= new SystemBlock(g,k,m,w);
   SystemBlock z= new SystemBlock(h,l,n,x);

   Computer Senturion =new Computer(a,d,y,t);
   Computer Ajaks =new Computer(b,e,z,u);

   String CPUSenturion =Senturion.getSystemBlock().getMotherBoard().getCpu().getBrand();
       System.out.println("Senturion computer has CPU's brand"+CPUSenturion);









    }

}
