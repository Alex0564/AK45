package ArtuomLesson9HW;

public class Education {
    private String profession;
    private String school;
    private String teacher;
    private int year;
    private String groupe;

        public Education (String profession, String school,String teacher,int year,String grope){
        this.profession=profession;
        this.school=school;
        this.teacher=teacher;
        this.year=year;
        this.groupe=grope;

    }
    public void setProfession(String profession) {

            this.profession = profession;
    }

    public String getProfession(){

            return profession;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setTeacher(String teacher) {

            this.teacher = teacher;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setGrope(String grope) {
        this.groupe = grope;
    }

    public String getGrope() {
        return groupe;
    }



    public Education (String profession, String teacher,int year,String grope){
        this.profession=profession;
       this.teacher=teacher;
        this.year=year;
        this.groupe=grope;
    }

    public Education (String profession, String teacher,String grope) {
        this.profession = profession;
        this.teacher = teacher;
        this.groupe = grope;
    }

    public Education (){}
    public void printYear(){    //-Здесь я написал метод с названием printYear
        System.out.println("In" +" "+ this.year+" Began learn new occupation");
    }
     public  void printClass(){
         System.out.println("Мы изучали эту профессию "+  this.profession+
         " в школе "+this.school+
         " нам преподавал "+this.teacher+
        " в  "+ this.year+" году "+
         " в группе  "+this.groupe);
     }
}
