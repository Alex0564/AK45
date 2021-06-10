package models;

public class CreatePlaylistRequest {
    private String name;
    private int id;

    public CreatePlaylistRequest(String name) {
        this.name = name;
    }

    public CreatePlaylistRequest(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
