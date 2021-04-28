package hw8oa;

public class WorkOA {
    public static void main(String[] args) {
        Pet sable = new Pet();
        sable.type = "cat";
        sable.name = "Sable";
        sable.color = "black";

        System.out.println("Our neighbor has a " +  sable.type +" " + sable.name);
        System.out.println(sable.name + " is " + sable.color);

        Pet skooby = new Pet();
        skooby.type = "dog";
        skooby.name = "Skooby";
        skooby.age = 3;

        System.out.println(skooby.name + " is Marco's " + skooby.type);
        System.out.println("He is " + skooby.age);

        skooby.run();
        sable.sleep();


        Student alex = new Student();
        alex.id = 13;
        alex.name = "Alex";
        alex.lastName = "An";

        alex.complete();
        alex.assign();

        Appliance dishwasher = new Appliance();
        dishwasher.type = "dishwasher";
        dishwasher.make = "LG";

        dishwasher.turnOn();
        dishwasher.brake();

        Bus schoolBus = new Bus();
        schoolBus.number = 456;
        schoolBus.color = "yellow";

        schoolBus.pass();
        schoolBus.stop();


    }
}
