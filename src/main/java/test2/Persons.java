package test2;

public class Persons {
    public String name;
    public String LastNAme;

    public Persons(String name, String lastNAme) {
        this.name = name;
        this.LastNAme = lastNAme;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastNAme() {
        return LastNAme;
    }

    public void setLastNAme(String lastNAme) {
        LastNAme = lastNAme;
    }
}
