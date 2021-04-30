package hw9;

public class Table {
    private String type;
    private String Size;
    private String made;

    public Table() {

    }

    public void setMade(String m){
        made = m;
    }
    public String getMade(){
        return made;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public Table(String type, String size, String made) {
        this.type = type;
        this.Size = size;
        this.made = made;
    }
}
