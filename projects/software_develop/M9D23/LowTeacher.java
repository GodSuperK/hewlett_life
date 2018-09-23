package M9D23;

public class LowTeacher extends Teacher {

    public LowTeacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    void toTeach() {
        System.out.println("我是低级老师，我为基础班代言");
    }
}
