package M9D17;

import java.util.Random;

/**
 * 数据加密问题
 * Input: 4位整数
 * Process:
 * 1. every single number pluses 5,
 * 2. 然后用和除以10的余数代替 it
 * 3. 再将第一位和第四位交换，第二位和第三位交换。(4321)
 * Output:
 * 1. 加密前的4位整数
 * 2. 加密后的4位整数
 */
public class Test6 {
    public static void main(String[] args) {
        // 构建一个随机的4位整数
        StringBuilder s = new StringBuilder();
        Random r = new Random();
        // first number can not be zero
        int first = r.nextInt(10);
        while (first == 0) {
            first = r.nextInt(10);
        }
        s.append(first);
        s.append(r.nextInt(10));
        s.append(r.nextInt(10));
        s.append(r.nextInt(10));
        int number = Integer.parseInt(s.toString());
        int cipherNumber = toEncrypt(number);
        System.out.println("明文： "+number+" 密文："+cipherNumber);

    }

    private static int toEncrypt(int n) {
        StringBuilder builder = new StringBuilder();
        int first = (n / 1000 + 5) % 10;
        int second = (n / 100 % 10 + 5) % 10;
        int third = (n / 10 % 10 + 5) % 10;
        int fourth = (n % 10 + 5) % 10;
        // 新顺序 4321
        builder.append(fourth);
        builder.append(third);
        builder.append(second);
        builder.append(first);
        return Integer.parseInt(builder.toString());

    }
}
