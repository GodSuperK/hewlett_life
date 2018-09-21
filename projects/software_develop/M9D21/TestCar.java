package M9D21;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car("五陵洪光", "灰色", 4, "吉H-8888", 8, 80);
        Car c2 = new Car("法拉利", "紫色", 2, "吉H-9999", 4, 150);
        System.out.println(c1.getDetails());
        System.out.println(c2.getDetails());
        c1.speedUp(20);
        c1.slowDown(20);

        c2.slowDown(10000);
        c2.speedUp(10000);
    }


}
