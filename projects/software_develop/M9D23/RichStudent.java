package M9D23;

public class RichStudent extends Student {
    @Override
    void toStudy() {
        System.out.println("我钱多，我可以上就业班");
    }

    @Override
    void toEat() {
        System.out.println("我钱多，我可以多浪费点粮食");
    }
}
