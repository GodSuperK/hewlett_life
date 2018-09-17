package M9D12;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 作业1 在控制台打印出个人基本信息，要求用变量对个人信息进行存储
        Quiz quiz1 = new Quiz1();
        show_work(quiz1);
        // 作业2 购物结算
        Quiz quiz2 = new Quiz2();
        show_work(quiz2);
        // 作业3 比较商品折后价格是否大于100元
        Quiz quiz3 = new Quiz3();
        show_work(quiz3);
        // 作业4 企业发放的奖金根据利润提成
        Quiz quiz4 = new Quiz4();
        show_work(quiz4);
        //作业5 使用switch实现菜单跳转
        Quiz quiz5 = new Quiz5();
        show_work(quiz5);
        // 作业6 算出从1到100中奇数相加的结果，并打印到控制台
        Quiz quiz6 = new Quiz6();
        show_work(quiz6);
        // 作业7 使用for循环语句打印九九乘法表
        Quiz quiz7 = new Quiz7();
        show_work(quiz7);
    }

    private static void show_work(Quiz quiz) {
        Scanner in = new Scanner(System.in);
        while (true) {
            quiz.show();
            System.out.println("1. 重新展示 \n2. 展示下一个作业\n您的指令> ");
            int go = in.nextInt();
            if (go == 2) {
                break;
            }
        }

    }
}
