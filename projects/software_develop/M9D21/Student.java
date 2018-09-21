package M9D21;

public class Student {

    public static final String SCHOOL = "日照职业技术学院";

    private String name;
    private String stuNumber;

    public Student(String name, String stuNumber) {
        this.name = name;
        this.stuNumber = stuNumber;
    }

    public static String getSchool() {
        return Student.SCHOOL;
    }


}
