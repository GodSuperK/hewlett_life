package M9D23;

public class HighTeacher extends Teacher {

    public HighTeacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    void toTeach() {
        System.out.println("我是高级老师，我只为定制班讲课");
    }
}
