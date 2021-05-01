package HW10;

public class Subjects {
    public String lessonName;
    public String Subjects;
    public String year;
    public Object name;
    public Object subjects;

    public Subjects(String lessonName, String subjects, String year) {
        this.lessonName = lessonName;
        Subjects = subjects;
        this.year = year;
    }

    public Subjects() { }

    public String getLessonName() {
        String lessonName1 = this.lessonName;
        return lessonName1;
    }

    public String getSubjects() {
        return Subjects;
    }

    public String getYear() {
        return year;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public void setSubjects(String subjects) {
        Subjects = subjects;
    }

    public void setYear(String year) {
        this.year = year;
    }


    public void print_info(){
        System.out.println("Subjects: " +
                "lessonName: " + lessonName + '\''+
                ", Subjects: " + Subjects + '\'' +
                ", year: " + year);

    }
}







