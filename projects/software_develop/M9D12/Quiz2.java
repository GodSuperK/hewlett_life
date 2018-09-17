package M9D12;

/**
 * 购物结算
 * @version 1.0
 * @author 孔德成
 */
class Quiz2 extends Quiz{

    void show() {
        System.out.println("现在运行的是实验2--------");
        double t_shirt_price = 245;
        double tennis_shoes_price = 570;
        double tennis_racket = 320;
        double rate = 0.8;
        // 购物车状态
        double[ ][ ] shopping_cart = {
                {t_shirt_price, 2},
                {tennis_shoes_price, 1},
                {tennis_racket, 1}
        };
        double total_money = 0;
        for (double[] item:shopping_cart) {
            total_money += item[0] * item[1];
        }
        double actual_money = total_money * rate;
        System.out.println("购物总金额为："+total_money+"商品8折，实际计算金额为："+actual_money+"元");
        System.out.println("实验2展示完成--------");
    }
}
