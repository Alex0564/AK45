package hashmap;

public class Site {
    private String nameSite;

    public Site(String nameSite) {
        this.nameSite = nameSite;
    }

    public String getNameSite() {
        return nameSite;
    }

    public void setNameSite(String nameSite) {
        this.nameSite = nameSite;
    }

    @Override
    public String toString() {
        return "nameSite = "
                + nameSite;
    }
}
