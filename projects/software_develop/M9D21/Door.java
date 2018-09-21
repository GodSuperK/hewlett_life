package M9D21;

public class Door {
    public double height;

    public Door() {
    }

    public Door(double height) {
        this.height = height;
    }

    public void openDoor(String doorName) {
        System.out.println("打开" + doorName);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
