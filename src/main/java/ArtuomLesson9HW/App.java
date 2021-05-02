package ArtuomLesson9HW;

public class App {
    public App() {
    }

    public static void main(String[] args) {

        System.out.println("========================Task1===========================");
        // Инициализирую обьекты класса Education
        Education QAAution12=new Education("QA_Automation", "TestPro","Baurzhan", 2021, "A12");
        Education QAAution10=new Education("QA_Automation","Baurzhan",2021,"A12");
        Education QAAution8=new Education("QA_Automation","Baurzhan","A12");
        Education QAAution14=new Education(){};
        Education Qa25=new Education();

        //использую сеттер для передачи данных полям  объекта
       QAAution14.setProfession("QAAutomation");
       QAAution14.setSchool("TestPro");
       QAAution14.setYear(2021);

       //Вывожу через геттер значение полей
        System.out.println(QAAution14.getSchool());
        System.out.println(QAAution14.getYear());
        System.out.println(QAAution14.getGrope()); //null

        // Вызов метода из класса
        QAAution10.printYear();
        QAAution12.printClass();
        QAAution14.printClass();  //не все поля класса заполнены

        System.out.println("========================Task2===========================");


        Kitchen fl57=new Kitchen("Table"+ "GasStove"+"Sink","Refrigerator",350);
        Kitchen fl58=new Kitchen("Refrigerator",300);
        Kitchen fl59=new Kitchen();



        fl57.printfloor();

        System.out.println("========================Task3===========================");

        House A97=new House(65,45,"West 4 Street",97);
        House A98=new House (50,"West 4Street",98);

        House A99= new House();

        A97.printClassA97();
//        A98.printClassA98();
//        A99.printClassA99();

        System.out.println("========================Task4===========================");

        Sneakers Art=new Sneakers("Nike", 14, "Male");
        Sneakers Ver= new Sneakers(10);
        Sneakers David=new Sneakers();

        Art.printClass();

        System.out.println("========================Task4===========================");

        laptop DavidPC=new laptop("HP",2020,"Aluminium",16);

        laptop MichaelPC=new laptop();

        MichaelPC.setBrand("HP");
        MichaelPC.setYear(2020);
        MichaelPC.setColor("Aluminium");
        MichaelPC.setMemory(16);

        System.out.println(DavidPC.getColor());

        System.out.println("Brand-  "+MichaelPC.getBrand());
        System.out.println("Year- "+MichaelPC.getYear());
        System.out.println("Color- "+MichaelPC.getColor());
        System.out.println("Memory- "+MichaelPC.getMemory());

        MichaelPC.printClass();
        DavidPC.printClass();




    }



}
