package lesson10;

public class App {
    public static void main(String[] args) {
        Student viktor = new Student("Viktor ","Gonsales",1985,Subjects.BIO);
        System.out.println(viktor.getLastName());
        System.out.println(viktor.getMajor());
    }
}
