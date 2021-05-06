package hw12ab;

public class Sister implements IFamily,IKids {
    private String name;
    private String nickName;

    public Sister(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
    }

    public void kid(String xx) {
        System.out.println(name + " " + nickName + " " + xx);

        @Override
        public void father () {
            System.out.println("I am father of my daughter.");
        }

        @Override
        public void mather () {
            System.out.println("I am mother of my daughter.");

        }

        @Override
        public void sister () {
            System.out.println("I am sister of my brother.");

        }

        @Override
        public void brother () {
            System.out.println("I am brother of my sister.");

        }
    }


    }

