package hw10;

public class Grill {
    private String name;
    private String model;
    private Modification modification;

    public Grill() {
    }

    public Grill(String name, String model, Modification modification) {
        this.name = name;
        this.model = model;
        this.modification = modification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Modification getModification() {
        return modification;
    }

    public void setModification(Modification modification) {
        this.modification = modification;
    }
}
