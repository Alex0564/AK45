package hw13;

public class Celebrities {
    private String name;
    private int age;
    private String sex;
    private String career;

    public Celebrities(String name, int age, String sex, String career) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.career = career;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "Celebrities{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", career='" + career + '\'' +
                '}';
    }
}





