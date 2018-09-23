package M9D23.work.duotai;


/**
 * instanceof运算符
 * 只被用于对象引用变量，检查左边的被测试对象 是不是 右边类或接口的 实例化。
 * 如果被测对象是null值，则测试结果总是false。
 * <p>
 * Class类的isInstance(Object obj)方法，obj是被测试的对象，
 * 如果obj是调用这个方法的class或接口 的实例，则返回true。
 * 这个方法是instanceof运算符的动态等价。
 */
public class Test5 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        func(cat);
        func(dog);
    }

    static void func(Animal animal) {
        if (animal instanceof Cat) {
            ((Cat) animal).catchMouse();
        } else if ((animal instanceof Dog)) {
            ((Dog) animal).kanJia();
        }
    }
}

abstract class Animal {
    abstract void eat();
}

class Cat extends Animal {
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }

    @Override
    void eat() {
        System.out.println("猫吃鱼");
    }

}

class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("狗吃骨头");
    }

    public void kanJia() {
        System.out.println("看家");
    }
}