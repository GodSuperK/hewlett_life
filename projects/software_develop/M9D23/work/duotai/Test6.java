package M9D23.work.duotai;

/**
 * 汽车类，包含run()方法。Benz类和JD类为派生类。
 * Benz在以200迈的速度在run，JD在以80迈的速度在run。
 */
public class Test6 {
    public static void main(String[] args) {
        Car_ benz = new Benz();
        Car_ jd = new JD();
        Guy guy1 = new Guy(benz);
        guy1.drive();
        guy1 = new Guy(jd);
        guy1.drive();
    }
}

abstract class Car_ {
    abstract void run();
}

class Benz extends Car_ {

    @Override
    void run() {
        System.out.println("Benz在以200迈的速度在run");
    }
}

class JD extends Car_ {

    @Override
    void run() {
        System.out.println("JD在以80迈的速度在run");
    }
}

class Guy {
    Car_ car;

    public Guy(Car_ car) {
        this.car = car;
    }

    public void drive() {
        if (this.car instanceof Benz) {
            ((Benz) this.car).run();
        } else if ((this.car instanceof JD)) {
            ((JD) this.car).run();
        }
    }
}