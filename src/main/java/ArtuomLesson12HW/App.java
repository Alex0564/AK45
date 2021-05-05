package ArtuomLesson12HW;

public class App {
    public static void main(String[] args) {
//===================================Practiсе with Inheritance============================================
        System.out.println("=============Practiсе with Inheritance===============");


        MyCoffeemachine BlackGlobal = new MyCoffeemachine("Global", "800", 2021);

        MyCoffeemachine GreySolution = new MyCoffeemachine("Global", "0810", 2021);


        Engine ref12 = new Engine("Samsung", 2021);
        Engine ref15 = new Engine("Samsung", 2021);

        Engine[] set = {ref12, ref15};


        Refrigerator Global2 = new Refrigerator("Global", Color.RED, 2021, 220, set);
        Refrigerator Solution15 = new Refrigerator("Global", Color.WHITE, 2021, 215, set);

//         String Engine=Solution15.getSet;
        // Здравствуйте, напишите пожалуйста сюда метод который вытащит модель двигателя. Цвет у меня получилось вытащить.
//          System.out.println(Engine);

        BlackGlobal.europeanPlug();
        BlackGlobal.caps();
        GreySolution.europeanPlug();
        GreySolution.caps();

            Global2.europeanPlug();
            Global2.keepAHAM();
            Solution15.europeanPlug();
            Solution15.keepAHAM();


           IEuropeanElectricPlug SamsungRB28=new Refrigerator("Samsung",Color.RED,2021,245,set);

           IEuropeanElectricPlug Barista=new MyCoffeemachine("Barista","Breville",2021);


           SamsungRB28.europeanPlug();
           Barista.caps();






//==============================================================================================================
        System.out.println("=============Iteration===============");

        IEuropeanElectricPlug Cofem1 = new MyCoffeemachine("Global", "800", 2021);

        IEuropeanElectricPlug Cofem2 = new MyCoffeemachine("Global0", "0810", 2021);

        IEuropeanElectricPlug Ref1 = new Refrigerator("Global", Color.RED, 2021, 220, set);

        IEuropeanElectricPlug Ref2 = new Refrigerator("Global", Color.WHITE, 2021, 215, set);

        IEuropeanElectricPlug[] plugs = {Cofem1, Cofem2, Ref1, Ref2};
        for (IEuropeanElectricPlug plug : plugs) {
            plug.europeanPlug();

        }
        Cofem1.europeanPlug();
        Cofem2.caps();

        Ref1.europeanPlug();


//============================================Вывожу значения через метод========================================================
        System.out.println("==============Вывожу значения через метод===============");


        Solution15.printInfo();
        Global2.printInfo();


        BlackGlobal.getPrintCof();
        GreySolution.getPrintCof();

//        Ref1,Ref2,Cofem1,Cofem2-Почему я не могу вывести их этими же методами соответственно?


//===========================================================================================================


    }
}
