package M9D23.work.duotai;

public class Test4 {
}

class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public MyTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    void display() {
        System.out.printf("现在的时间是%d:%d:%d", this.hour, this.minute, this.second);
    }
}
