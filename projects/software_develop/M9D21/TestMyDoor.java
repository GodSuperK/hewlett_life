package M9D21;

public class TestMyDoor {
    public static void main(String[] args) {
        MyDoor myDoor = new MyDoor("MyDoor", 123);
        myDoor.openDoor(myDoor.doorName);
    }
}
