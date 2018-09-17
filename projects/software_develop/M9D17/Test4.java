package M9D17;

import java.util.Random;

/**
 * 实验四：数组获取最值(获取数组中的最大值最小值)
 * 1. 两两比较
 * 2. 返回较大（较小）的
 * 3. 重复以上步骤
 */
public class Test4 {
    static int[] aNumbers = new int[100];

    static {
        // 数组初始化
        for (int i = 0; i < aNumbers.length; i++) {
            Random r = new Random();
            // 获取[0, 100)之间的int整数
            aNumbers[i] = r.nextInt(101);
        }
    }

    public static void main(String[] args) {

        // 获取最大值,最小值
        int max = aNumbers[0];
        int min = aNumbers[0];
        for (int i : aNumbers) {
            max = max > i ? max : i;
            min = min < i ? min : i;
        }
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);

    }
}
