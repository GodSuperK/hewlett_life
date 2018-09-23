package M9D23.work.duotai;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(new CalNumber(1, 2).max);
        System.out.println(new CalNumber(2.0, 3.0, 4.0).product);
        System.out.println(new CalNumber("Hello", "World").isEqual);
    }
}

class CalNumber {
    int max; // 最大值
    double product; //乘积
    boolean isEqual; // 是否相等

    public CalNumber(int n1, int n2) {
        this.max = Math.max(n1, n2);
    }

    public CalNumber(double n1, double n2, double n3) {
        this.product = n1 * n2 * n3;
    }

    public CalNumber(String s1, String s2) {
        this.isEqual = s1.equals(s2);
    }
}
