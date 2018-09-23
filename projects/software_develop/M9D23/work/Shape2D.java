package M9D23.work;

public interface Shape2D {
    public static final double PI = 3.14;

    public abstract double grith();

    public abstract double area();
}

class Circle implements Shape2D {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double grith() {
        return 2 * PI * r;
    }

    @Override
    public double area() {
        return PI * Math.sqrt(r);
    }
}

class Rectangle implements Shape2D {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double grith() {
        return (width + height) * 2;
    }

    @Override
    public double area() {
        return width * height;
    }
}

