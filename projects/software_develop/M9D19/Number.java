class Number {
    private int n1 = 0;
    private int n2 = 0;

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int addition() {
        return this.n1 + this.n2;
    }

    public int subtraction() {
        return this.n1 - this.n2;
    }

    public int multiplication() {
        return this.n1 * this.n2;
    }

    public int division() {
        return this.n1 / this.n2;
    }

    public static void main(String[] args) {
        Number number = new Number(10, 2);
        System.out.println("加法：" + number.addition());
        System.out.println("减法：" + number.subtraction());
        System.out.println("乘法：" + number.multiplication());
        System.out.println("除法：" + number.division());
    }

}
