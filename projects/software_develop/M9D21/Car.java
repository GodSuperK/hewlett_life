package M9D21;

public class Car extends Vehicles {

    // 成员变量：seats（座位数），speed(速度)
    private int seats;
    private double speed;

    public Car(String name, String color, double weight, String plate, int seats, double speed) {
        super(name, color, weight, plate);
        this.seats = seats;
        this.speed = speed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }


    /**
     * 加速
     */
    public void speedUp(double a) {
        this.setSpeed(this.getSpeed() + a);
    }

    /**
     * 减速
     */
    public void slowDown(double a) {
        this.setSpeed(this.getSpeed() - a);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        // 最高时速不超过200, 最低时速不低于0
        if (speed < 0) {
            this.speed = 0;
        } else if (speed > 200) {
            this.speed = 200;
        } else {
            this.speed = speed;
        }
    }


    @Override
    public String getDetails() {
        return "Car{" +
                "seats=" + seats +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", plate='" + plate + '\'' +
                '}';
    }
}
