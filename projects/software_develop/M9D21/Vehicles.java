package M9D21;

public class Vehicles {
    // 成员变量：name（品牌）、color（颜色）、weight（重量）、plate（车牌号码）；
    String name;
    String color;
    double weight;
    String plate;

    public Vehicles(String name, String color, double weight, String plate) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.plate = plate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return "Vehicles{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", plate='" + plate + '\'' +
                '}';
    }
}
