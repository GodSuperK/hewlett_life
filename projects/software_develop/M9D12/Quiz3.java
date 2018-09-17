package M9D12;

import java.util.Scanner;

/**
 * 比较商品折后价格是否大于100元, 使用Scanner对象和System.in来实现控制台输入
 * @version 1.0
 * @author 孔德成
 *
 */
class Quiz3 extends Quiz{
    void show() {
        System.out.println("现在运行的是实验3--------");
        Scanner in = new Scanner(System.in);
        System.out.println("请输入商品折后价格： ");
        double price = in.nextDouble();
        if (price > 100) {
            System.out.println("商品折后价格大于100元");
        }else {
            System.out.println("商品折后价格小于100元");
        }
        System.out.println("实验3展示完成--------");
    }
}
