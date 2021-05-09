package less10homework;

public class App {
    public static void main(String[] args) {
        Page letter = new Page();
        letter.setSize("Letter");
        letter.setType("NewRoman");
        letter.setInterval(1.5);
       letter.printInfo();
       Page times = new Page("A4", "New Time", 2.0);
       times.printInfo();

       book tripwire = new book("Tripwire", "Action", "Attic", "Executive", "Lee Child");
       book electrician = new book();
       electrician.setAuthor("Rex Miller");
       electrician.setName("Electrician's pocket manual");
       electrician.setGenre("handbook");
       electrician.setSize("A16");
       electrician.setType("Arial");
       System.out.println();
       tripwire.bookInfo();
       electrician.bookInfo();

        System.out.println("Book " + tripwire.getName()+ " written with size "+ tripwire.getSize());
        System.out.println("Book " + electrician.getName()+ " written with size "+ electrician.getSize());

        notebook classnote = new notebook(36, "B5", 75);
        notebook homenote = new notebook();
        homenote.setSize("A5");
        homenote.setPages(18);
        homenote.setPaperdensity(80);
        System.out.println("\nClass notebook:");
        classnote.noteInfo();
        System.out.println("\nHome notebook:");
        homenote.noteInfo();

    }
}
