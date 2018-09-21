package M9D21;

public class Circle {
    double radius;

    public Circle() {
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getArea() {
        return Math.PI * Math.sqrt(this.radius);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }


    public void show() {
        System.out.println("半径：" + this.radius);
        System.out.println("面积：" + this.getArea());
        System.out.println("周长：" + this.getPerimeter());
    }
}
