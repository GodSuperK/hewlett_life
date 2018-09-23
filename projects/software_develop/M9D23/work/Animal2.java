package M9D23.work;

public class Animal2 {
}

abstract class Bird2 {
    public static final int LEG = 2;

    public abstract void haveEggs();

    public abstract void fly();
}

abstract class Insect2 {
    public static final int LEG = 6;

    public abstract void spawn();

    public abstract void fly();
}

class Dove2 extends Bird2 {

    @Override
    public void haveEggs() {
        System.out.println("鸽子在下蛋");
    }

    @Override
    public void fly() {
        System.out.println("鸽子在飞");
    }
}

class WildGoose2 extends Bird2 {

    @Override
    public void haveEggs() {
        System.out.println("大雁在下蛋");
    }

    @Override
    public void fly() {
        System.out.println("大雁在飞");
    }
}


class Ant2 extends Insect2 {


    @Override
    public void spawn() {
        System.out.println("蚂蚁在产卵");
    }

    @Override
    public void fly() {
        System.out.println("蚂蚁在飞");
    }
}

class Bee2 extends Insect2 {

    @Override
    public void spawn() {
        System.out.println("蜜蜂在产卵");
    }

    @Override
    public void fly() {
        System.out.println("蜜蜂在飞");
    }
}