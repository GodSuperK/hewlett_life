package M9D17;

import java.util.Scanner;

/**
 * 实验一: 键盘录入两个数据，比较两个数据(字符串，数值)是否相等
 */

class Test1 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("First: ");
        // 捕获一个字符串，空或空串都不会被捕获
        String arg1 = in.next();
        System.out.print("Second: ");
        String arg2 = in.next();
        Double arg3 = null;
        Double arg4 = null;
        try {
            // 尝试将输入转为double类型
            arg3 = Double.parseDouble(arg1);
            arg4 = Double.parseDouble(arg2);
            // 进行double类型比较
            if (arg3 == arg4) {
                System.out.println("Number1: " + arg3 + "\nNumber2: " + arg4 + "\n数据相等");
            } else {
                System.out.println("Number1: " + arg3 + "\nNumber2: " + arg4 + "\n数据不相等");
            }
        } catch (NumberFormatException nfe) {
            // 转换失败后，进行字符串比较
            if (arg1.equals(arg2)) {
                System.out.println("String1: " + arg1 + "\nString2: " + arg2 + "\n数据相等");
            } else {
                System.out.println("String1: " + arg1 + "\nString2: " + arg2 + "\n数据不相等");
            }
        }
    }


}


