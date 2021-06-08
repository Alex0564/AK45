package ao_models;

public class AO_Tag {
    private long id;
    private String name;

    public AO_Tag(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
