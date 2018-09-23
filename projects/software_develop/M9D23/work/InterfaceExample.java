package M9D23.work;

import java.util.Scanner;

public class InterfaceExample {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("请选择图形：1. 圆形 2. 矩形 3. 退出程序\n>>> ");
            int shape = in.nextInt();
            switch (shape) {
                case 1:
                    calCircle(in);
                    break;
                case 2:
                    calRectangle(in);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("输入无效");
                    break;
            }
        }


    }

    static void calCircle(Scanner in) {
        System.out.println("请输入圆的半径 >>> ");
        double r = in.nextDouble();
        Shape2D circle = new Circle(r);
        System.out.println("圆的周长：" + circle.grith());
        System.out.println("圆的面积：" + circle.area());

    }

    static void calRectangle(Scanner in) {
        System.out.println("请输入矩形的宽 >>> ");
        double width = in.nextDouble();
        System.out.println("请输入矩形的高 >>> ");
        double height = in.nextDouble();
        Shape2D rec = new Rectangle(width, height);
        System.out.println("矩形的周长：" + rec.grith());
        System.out.println("矩形的面积：" + rec.area());
    }
}
