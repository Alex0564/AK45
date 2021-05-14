package homework12ab;



public class App {
    public static void main(String[] args) {
        IHumanBody body = new HumanBody("Human body has 600 muscles","206");
        body.muscles();
        System.out.println(body.bones());

            IBacteriaCell cell = (IBacteriaCell) new prokaryoticCell("Prtsf ","hdshd");
cell.bacteria();
       cell.archaea();

        }
    }







