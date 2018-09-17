package M9D17;

import java.util.Scanner;

/**
 * 实验一: 键盘录入两个数据，比较两个数据(字符串，数值)是否相等
 * Input: 1. 字符串 字符串
 *        2. 字符串 数值
 *        3. 数值 数值
 *        4. 输入当中包含 空 或 空串
 *
 * Process: 1. 使用字符串的静态方法 equals
 *          2. 将两个输入转为同类型：
 *              :) 将字符串转为数值， 然后使用 ==
 *              :) 将数值转为字符串， 然后使用 equals
 *          3. ==
 *          4. 重新获取输入
 * Output:
 *         1.先打印输入及类型
 *         2. 再打印比较结果
 */

class Test1 {
    public static void main(String[] args) throws Exception{
        Scanner scanner =new Scanner(System.in);//接收键盘输入的数据
        System.out.println("请输入数据：");
        while (scanner.hasNext()) {//现在有输入数据
            System.out.println("您输入的内容为："+scanner.next());
        }
        scanner.close();//此处一般省略
    }
    private String getInputString() {
        return null;
    }
}
