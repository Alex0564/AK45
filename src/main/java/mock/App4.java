package mock;

    public class App4{
        public static void main(String[] args){

            System.out.println("Output:");
            Fizzbuzz(100);
        }

        //FizzBuzz() method
        public  static void Fizzbuzz(int num){
            for (int i=1;i<=num;i++){
                if (i%3==0){	System.out.print("Fizz, ");}
                else if (i%5==0){System.out.print("Buzz, ");}
                else System.out.print(i+", ");
            }
        }


    }

