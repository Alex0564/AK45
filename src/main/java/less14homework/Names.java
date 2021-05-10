package less14homework;

public class Names {
   private String name;



   @Override
   public String toString() {return "Name: " + name;}

   public Names(String name) {this.name = name;}
   public String getName() {return name;}
   public void setName(String name) {this.name = name;}

   public Names() {
   }

}
