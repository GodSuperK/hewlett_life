package M9D23;

public class PoorStudent extends Student {

    public PoorStudent(String name, int age, String class_) {
        this.name = name;
        this.age = age;
        this.class_ = class_;
    }

    @Override
    void toStudy() {
        System.out.println("我没钱，我只能上基础班");
    }

    @Override
    void toEat() {
        System.out.println("我没钱，我只能少吃点");
    }
}
