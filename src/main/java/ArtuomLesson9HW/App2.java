package ArtuomLesson9HW;



public class App2 {
    public static void main(String[] args) {
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



