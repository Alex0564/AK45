package inheritance;

public class App10 {
    public static void main(String[] args) {

        Animal an1 = new Animal("Cow", Gender.SHE, "Black", "2000 lb",3);

        Animal an2 = new Animal();
        an2.setKind("Horse");
        an2.setGender(Gender.HE);
        an2.setColor("White");
        an2.setWeight("3000 lb");
        an2.setAge(5);

        an1.printAnimal();
        an2.printAnimal();

        System.out.println("Kind = " + an2.getKind() + ", Gender = " + an2.getGender() + ", Color = " + an2.getColor() + ", Weight = " + an2.getWeight() + ", Age = " + an2.getAge());

        Cat cat1 = new Cat(Gender.HE, "Brown", "10 lb", 1, "Meow!");
        Cat cat2 = new Cat();
        cat2.setGender(Gender.SHE);
        cat2.setColor("Red");
        cat2.setWeight("12 lb");
        cat2.setAge(2);
        cat2.setSound("Moore!");

        cat1.printCat();
        cat2.printCat();

        System.out.println("Gender = " + cat2.getGender() + ", Color = " + cat2.getColor() + ", Weight = " + cat2.getWeight() + ", Age = " + cat2.getAge() + ", Sound = " + cat2.getSound());

        Dog dog1 = new Dog(Gender.SHE, "Gray", "40 lb", 6);
        Dog dog2 = new Dog();
        dog2.setGender(Gender.HE);
        dog2.setColor("Black");
        dog2.setWeight("60 lb");
        dog2.setAge(10);

        dog1.printDog();
        dog2.printDog();

        System.out.println("Gender = " + dog2.getGender() + ", Color = " + dog2.getColor() + ", Weight = " + dog2.getWeight() + ", Age = " + dog2.getAge());

        Parrot parrot1 = new Parrot(Gender.HE, "Green", "2 lb", 3, Cover.PLUMAGE);
        Parrot parrot2 = new Parrot();
        parrot2.setGender(Gender.SHE);
        parrot2.setColor("Yellow");
        parrot2.setWeight("1 lb");
        parrot2.setAge(1);
        parrot2.setCover(Cover.PLUMAGE);

        parrot1.printParrot();
        parrot2.printParrot();

        System.out.println("Gender = " + parrot2.getGender() + ", Color = " + parrot2.getColor() + ", Weight = " + parrot2.getWeight() + ", Age = " + parrot2.getAge() + ", Cover = " + parrot2.getCover());



    }
}
