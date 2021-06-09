package myModels;

import java.util.Arrays;

public class MyPet {
    private long id;
    private String name;
    private MyCategory category;
    private String [] photoUrls;
    private Tag[] tags;
    private Status status;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MyCategory getCategory() {
        return category;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public Tag[] getTags() {
        return tags;
    }

    public Status getStatus() {
        return status;
    }

    public MyPet(String name, MyCategory category, String[] photoUrls, Tag[] tags, Status status) {
//        this.id = id; id приходит в ответе, не надо создавать
        this.name = name;
        this.category = category;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }

    @Override
    public String toString() {
        return "MyPet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", photoUrls=" + Arrays.toString(photoUrls) +
                ", tags=" + Arrays.toString(tags) +
                ", status=" + status +
                '}';
    }
}
