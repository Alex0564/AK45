package lesson15ExceptionsStatics;

public class App1 {
    public static void main(String[] args) {
        Person anna = new Person("Anna", "Miller");
        anna.getName();

        Person.sayHello();
    }

}
