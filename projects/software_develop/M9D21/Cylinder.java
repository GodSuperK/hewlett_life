package M9D21;

public class Cylinder extends Circle {
    private double height;


    public Cylinder(double r, double h) {
        super(r);
        this.height = h;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    public void showVolume() {
        System.out.println("体积：" + this.getVolume());
    }

}
