package ArtuomLesson8HW;

public class App {
    public static void main(String[] args) {
        Laptop me = new Laptop();
        me.Laptopmodel="HP";
        me.Processormodel="Intel Core 5";
        me.Operationsystem="Windows 10 Home";
        me.Browsername="Chrome, FireFox, Edge";

        Laptop myWife=new Laptop();
        myWife.Laptopmodel="HP";
        myWife.Processormodel="Intel Core 7";
        myWife.Operationsystem="Windows 10 Home";
        myWife.Browsername="Chrome";

        System.out.println("My wife Laptop Model= "+myWife.Laptopmodel);

        me.Help();
        myWife.HelpformyWife();

        me.printinfo();
        myWife.printinfo2();



         House myHouse= new House();
         myHouse.Streetname="345 Street";
         myHouse.numberofhouse=1000;
         myHouse.floors=75;
         myHouse.hight=350;

         House nearMe=new House();
         nearMe.Streetname="345 street";
         nearMe.numberofhouse=950;
         nearMe.floors=68;
         nearMe.hight=330;


         myHouse.houseforme();
         nearMe.forMyneiborgh();



         Bicycle my=new Bicycle();
         my.Cost=200;
         my.Type="Mountain";

         Bicycle MyWife=new Bicycle();
         MyWife.Cost=200;
         MyWife.Type="Mountain";

        System.out.println(MyWife.Type);

        my.like();

         Software Our=new Software();
         Our.Cost=500000;
         Our.SoftwareName="'As easy as pie'";
         Our.Users=10000000;

         Software Competitor=new Software();
         Competitor.Cost=400000;
         Competitor.SoftwareName="It is simplicity itself";
         Competitor.Users=350000;

         Our.have();
         Competitor.Competitors();



    }
}


