package homework12a;

 public class Banana implements IFruits{
     public String region;

     public Banana(String region) {
         this.region = region;
     }

     @Override
        public void fruitName() {
            System.out.println("I am banana from: "+region+" - My price is "+price());
        }

        @Override
        public int price() {
            return 7;
        }
    }

