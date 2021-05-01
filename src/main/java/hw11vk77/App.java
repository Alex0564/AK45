package hw11vk77;

public class App {
    public static void main(String[] args) {
        /*
        HOMEWORK #11
        1. Create 2 computers
        2. Get CPU Brand from computer
        */
        ////PLAN

        /*
        BASE - Computer  ->
        composites:        SystemBlock ->(done)
                                        PowerSupply     ->(done)
                                                                Brands
                                                                PowerSupplyModel

                                        Disk            ->(done)
                                                                Brands
                                                                DiskCapacity

                                        GraphicAdapter  ->(done)
                                                                Brands
                                                                GraphAModel

                                        Motherboard     ->(done)
                                                                CPU -> (done)
                                                                        CPUmodel
                                                                        Brand
                                                                RAM ->  (done)
                                                                        RAMmodel
                                                                        RAMsize
                                                                        Brands

                                                                MBmodel
                                                                Brands
                           Monitors ->(done)
                                        Connectiontypes
                           Keyboard ->(done)
                                        Connectiontypes
                           Mouse    ->(done)
                                        Connectiontypes
        */

        ///CODE
        // HOMEWORK TASK -  1) Create 2 computer;    2) Get CPU Brand from computer
        //CREATE COMPUTER 1
        //1 CPU
        CPU cpu= new CPU(Brands.INTEL,CPUmodel.COREi7);//done
        //2 RAM
        RAM ram= new RAM(Brands.CRUCIAL,RAMmodel.DDR4,RAMsize.R2X16GB);//done

        //3 Motherboard compose
        MotherBoard mb = new MotherBoard(Brands.ASUS,MBmodel.iB460,cpu,ram);//done

        //4 GraphicAdapter
        GraphicAdapter graphadapter = new GraphicAdapter(Brands.NVIDIA,GraphAModel.GTX2060);//done

        //5 Disk
        Disk disk = new Disk(Brands.SAMSUNG,DiskModel.SSD,DiskCapacity.C1TB);//done

        //6 PowerSupply
        PowerSupply powersupply = new PowerSupply(Brands.EVGA,PowerSupplyModel.W850);//done

        //7 SystemBlock compose
        SystemBlock systemblock = new SystemBlock(powersupply,disk,graphadapter,mb);//done

        //8 Monitors
        Monitor monitor = new Monitor(Brands.LG,MonitorModel.UHD4K,32,Connectiontypes.HDMI);//done

        //9 Keyboard
        Keyboard keyboard = new Keyboard(Brands.LOGITECH,KeyboardModel.MECHANIC,Connectiontypes.USB);//done

        //10 Mouse
        Mouse mouse=new Mouse(Brands.LOGITECH,MouseType.LASER,Connectiontypes.BLUETOOTH);//done

        //11 COMPUTER - COMPOSE -CREATE COMPUTER 1
        Computer computer = new Computer(mouse,keyboard,systemblock,monitor);//done
        //getInfo of COMPUTER 1
        System.out.println("\nTASK #1 - CREATE 2 COMPUTERs \n ");
        System.out.println(" Brand name of Computer #1 : "+computer.getSystemBlock().getMotherBoard().getBrand().toString());
        computer.getInfo();
        System.out.println("--------------------------------");

        //12 CREATE COMPUTER 2
        // SystemBlock DELL compose
        MotherBoard dellmb = new MotherBoard(Brands.DELL,MBmodel.iB560,new CPU(Brands.INTEL,CPUmodel.COREi5),ram);//done
        SystemBlock systemblockdell = new SystemBlock(powersupply,disk,graphadapter,dellmb);//done
        Computer computerDell = new Computer(mouse,keyboard,systemblockdell,monitor);

        System.out.println(" Brand name of Computer #2 : "+computerDell.getSystemBlock().getMotherBoard().getBrand().toString());
        //invoke method getInfo
        computerDell.getInfo();
        System.out.println("--------------------------------\n");

        //2) Get CPU Brand from COMPUTER #2
        System.out.println("TASK #2 -Get CPU Brand from COMPUTERs  \n ");
        System.out.println("================Computer CPU brand and model");
        String CPUbrand = computer.getSystemBlock().getMotherBoard().getCpu().getBrand().toString();
        String CPUmodel = computer.getSystemBlock().getMotherBoard().getCpu().getModel().name();
        System.out.println("COMPUTER #1: "+ CPUbrand+" "+CPUmodel);
        CPUbrand = computerDell.getSystemBlock().getMotherBoard().getCpu().getBrand().toString();
        CPUmodel = computerDell.getSystemBlock().getMotherBoard().getCpu().getModel().name();
        System.out.println("COMPUTER #2: "+CPUbrand+" "+CPUmodel);
        //
    }
}
