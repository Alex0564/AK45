package HW13;

public class billboard2020 {
    private String name;
    private String song;
    private int position;

    public billboard2020(String name, String song, int position) {
        this.name = name;
        this.song = song;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getSong() {
        return song;
    }

    public int getPosition() {
        return position;
    }

    public String getFullChart(){
        return position+". "+name+"Song - "+song;
    }
}
