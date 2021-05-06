package homework12ab;



public class App {
    public static void main(String[] args) {
        IHumanBody body = new IHumanBody() {
            @Override
            public void muscles() {
                System.out.println("There are about 600 muscles in the human body.");

            }

            @Override
            public int bones() {
                return 206;
            }

           IBacteriaCell cell = (IBacteriaCell) new prokaryoticCell();

        };
    }
}







