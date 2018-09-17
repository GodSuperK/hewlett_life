package M9D12;

import java.util.Scanner;

/**
 * 企业发放的奖金根据利润提成
 * @version 1.0
 * @author 孔德成
 */

/*
Python if 逻辑
    if (profit > 100) {
            // 高于100万元时，超过100万元的部分按1%提成；
            bonus += (profit-100)*(1.0/100);
        }else if (profit>60 && profit <=100) {
            if (profit > 100) {
                profit = 100;
            }
            // 60万到100万之间时，高于60万元的部分，可提成1.5%，
            bonus += (profit-60)*(1.5/100);
        }else if (profit>40 && profit<=60) {
            if (profit > 60) {
                profit = 60;
            }
            // 40万到60万之间时高于40万元的部分，可提成3%；
            bonus += (profit-40)*(3.0/100);
        }else if (profit>20 && profit <=40) {
            if (profit > 40) {
                profit = 40;
            }
            // 20万到40万之间时，高于20万元的部分，可提成5%；
            bonus += (profit-20)*(5.0/100);
        }else if (profit>10 && profit<=20) {
            if (profit > 20) {
                profit = 20;
            }
            // 高于10万元的部分，可可提成7.5%；
            bonus += (profit-10)*(7.5/100);
        }else if (profit > 0){
            // 利润低于或等于10万元时，奖金可提10%；
            bonus += profit * (10.0/100);
        }
        System.out.println("当月利润为："+profit+unit+" 发放奖金为："+bonus+unit);
 */
class Quiz4 extends Quiz{
    void show() {
        System.out.println("现在运行的是实验4--------");
        Scanner in = new Scanner(System.in);
        System.out.println("请输入当月利润：");
        double profit = in.nextDouble();
        String unit = "万";
        double bonus = 0;
        if (profit > 100) {
            // 高于100万元时，超过100万元的部分按1%提成；
            bonus = (profit-100)*(1.0/100)+(100-60)*(1.5/100)+(60-40)*(3.0/100)+(40-20)*(5.0/100)+(20-10)*(7.5/100)+10*(10.0/100);
        }else if (profit>60 && profit <=100) {
            // 60万到100万之间时，高于60万元的部分，可提成1.5%，
            bonus = (profit-60)*(1.5/100)+(60-40)*(3.0/100)+(40-20)*(5.0/100)+(20-10)*(7.5/100)+10*(10.0/100);
        }else if (profit>40 && profit<=60) {
            // 40万到60万之间时高于40万元的部分，可提成3%；
            bonus = (profit-40)*(3.0/100)+(40-20)*(5.0/100)+(20-10)*(7.5/100)+10*(10.0/100);
        }else if (profit>20 && profit <=40) {
            if (profit > 40) {
                profit = 40;
            }
            // 20万到40万之间时，高于20万元的部分，可提成5%；
            bonus = (40-20)*(5.0/100)+(20-10)*(7.5/100)+10*(10.0/100);
        }else if (profit>10 && profit<=20) {
            if (profit > 20) {
                profit = 20;
            }
            // 高于10万元的部分，可可提成7.5%；
            bonus = (profit-10)*(7.5/100)+10*(10.0/100);
        }else if (profit <= 10){
            // 利润低于或等于10万元时，奖金可提10%；
            bonus = profit * (10.0/100);
        }
        System.out.println("当月利润为："+profit+unit+" 发放奖金为："+bonus+unit);
        System.out.println("实验4展示完成--------");
    }
}


