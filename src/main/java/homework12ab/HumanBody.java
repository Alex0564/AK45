package homework12ab;

public class HumanBody implements IHumanBody {
    private String muscles;
    private String bones;

    public HumanBody(String muscles, String bones) {
        this.muscles = muscles;
        this.bones = bones;
    }

    @Override
    public void muscles() {
        System.out.println("Human body has 600 muscles.");
    }

    @Override
    public int bones() {
        return 206;
    }
}
