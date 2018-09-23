package M9D23.work;

public class Animal1 {
}

abstract class Bird {
    public static final int LEG = 2;

    public abstract void haveEggs();
}

abstract class Insect {
    public static final int LEG = 6;

    public abstract void spawn();
}

interface FlyAnimal {
    public abstract void fly();
}

class Dove extends Bird implements FlyAnimal {

    @Override
    public void haveEggs() {
        System.out.println("鸽子在下蛋");
    }

    @Override
    public void fly() {
        System.out.println("鸽子在飞");
    }
}

class WildGoose extends Bird implements FlyAnimal {

    @Override
    public void haveEggs() {
        System.out.println("大雁在下蛋");
    }

    @Override
    public void fly() {
        System.out.println("大雁在飞");

    }
}

class Ant extends Insect implements FlyAnimal {

    @Override
    public void spawn() {
        System.out.println("蚂蚁在产卵");
    }

    @Override
    public void fly() {
        System.out.println("蚂蚁在飞");
    }
}

class Bee extends Insect implements FlyAnimal {

    @Override
    public void spawn() {
        System.out.println("蜜蜂在产卵");
    }

    @Override
    public void fly() {
        System.out.println("蜜蜂在飞");
    }
}