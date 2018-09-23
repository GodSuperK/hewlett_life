package M9D23.work.duotai;

public class Test7 {
    public static void main(String[] args) {
        Cylinder cc = new Cylinder(3, 5);
        System.out.println("圆柱的面积: " + cc.area());
        System.out.println("圆柱的体积: " + cc.volume());
    }
}

class Point {
    int x;
    int y;
}

class Circle extends Point {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    double area() {
        return Math.PI * Math.sqrt(r);
    }
}

class Cylinder extends Circle {

    double h;

    public Cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    @Override
    double area() {
        return super.area() + 2 * Math.PI * this.r * this.h;
    }

    double volume() {
        return super.area() * this.h;
    }
}
