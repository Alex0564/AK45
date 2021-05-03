package hw10daria;

public class Movies {
    private String name;
    private String country;
    private kind [] kind;

    public Movies(String name, String country){ this.name = name; this.country=country; }
    public void setName(String name){ this.name=name;}
    public String getName(){ return name;}
    public void setCountry(String country){this.country=country;}
    public String getCountry(){return country;}

//new constructor
    public Movies(String name, String country, kind[] kind) {
        this.name = name; this.country = country; this.kind = kind; }

    public kind[] getKind() { return kind; }
    public void setKind(kind[] kind) { this.kind = kind; }


    // signle enum
//    Movies(String name, String country, kind kind){
//        this.name = name;
//        this.country=country;
//        this.kind=kind; }
//
//    public void setName(String name){ this.name=name;}
//    public String getName(){ return name;}
//    public void setCountry(String country){this.country=country;}
//    public String getCountry(){return country;}
//
//    public hw10daria.kind getKind() { return kind; }
//    public void setKind(kind kind) { this.kind = kind; }


}
