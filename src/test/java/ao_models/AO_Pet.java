package ao_models;

public class AO_Pet {
    private long id;
    private String name;
    private AO_Category category;
    private String[]photoUrls;
    private AO_Tag[] tags;
    private AO_Status status;

    public AO_Pet(String name, AO_Category category, String[] photoUrls, AO_Tag[] tags, AO_Status status) {
        this.name = name;
        this.category = category;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public AO_Category getCategory() {
        return category;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public AO_Tag[] getTags() {
        return tags;
    }

    public AO_Status getStatus() {
        return status;
    }

    public void setId(long id) {
        this.id = id;
    }
}
