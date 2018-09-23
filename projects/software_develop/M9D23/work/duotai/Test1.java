package M9D23.work.duotai;

public class Test1 {
    public static void main(String[] args) {
        WuMingFen f1 = new WuMingFen("牛肉", 3, true);
        WuMingFen f2 = new WuMingFen("牛肉", 2);
        WuMingFen f3 = new WuMingFen("酸辣面", 2, true);
        f1.check();
        f2.check();
        f3.check();
    }
}

class WuMingFen {
    String theMa = null;  // 面码
    int quantity = 0;  // 粉的分量(两)
    boolean likeSoup = false; // 是否带汤

    public WuMingFen(String theMa, int quantity, boolean likeSoup) {
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
    }

    public WuMingFen(String theMa, int quantity) {
        this.theMa = theMa;
        this.quantity = quantity;
    }

    public void check() {
        System.out.println("WuMingFen{" +
                "theMa='" + theMa + '\'' +
                ", quantity=" + quantity +
                ", likeSoup=" + likeSoup +
                '}');
    }
}