package hw12ab;

public class Brother implements IFamily, IKids{
    @Override
    public void father() {
        System.out.println("I am the best father for my family.");

    }

    @Override
    public void mather() {
        System.out.println("I am the best mother for my family.");

    }

    @Override
    public void sister() {
        System.out.println("I am the younger child one in the family.");

    }

    @Override
    public void brother() {
        System.out.println("I am the oldest child in the family");

    }
}
