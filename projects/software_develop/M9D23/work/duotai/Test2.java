package M9D23.work.duotai;

import M9D21.Vehicles;

public class Test2 {
}

abstract class Vehicle {

    abstract void go();

    abstract void stop();
}

// 自行车、汽车、摩托车类
class Biycle extends Vehicle {

    @Override
    void go() {
        System.out.println("自行车走");
    }

    @Override
    void stop() {
        System.out.println("自行车停");
    }
}

class Car extends Vehicle {

    @Override
    void go() {
        System.out.println("汽车走");
    }

    @Override
    void stop() {
        System.out.println("汽车停");
    }
}

class Motorbike extends Vehicle {

    @Override
    void go() {
        System.out.println("摩托车走");
    }

    @Override
    void stop() {
        System.out.println("摩托车停");
    }
}