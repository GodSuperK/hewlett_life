package M9D23.work;

abstract class Fu {
    int age;

    abstract void sleep();
}

interface Smoke {
    public abstract void smokee();
}

interface Drink {
    public abstract void drink();
}

class Nan extends Fu implements Smoke, Drink {

    @Override
    public void smokee() {

    }

    @Override
    public void drink() {

    }

    @Override
    void sleep() {

    }
}

class Nv extends Fu {

    @Override
    void sleep() {

    }
}
