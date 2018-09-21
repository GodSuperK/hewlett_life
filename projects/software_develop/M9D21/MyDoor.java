package M9D21;

public class MyDoor extends Door {
    String doorName;

    public MyDoor(String doorName) {
        this.doorName = doorName;
    }

    public MyDoor(String doorName, double height) {
        super(height);
        this.doorName = doorName;
    }

    public void openDoor(String doorName) {
        super.openDoor(doorName);
        System.out.println("使用super来升级啦");
    }
}
