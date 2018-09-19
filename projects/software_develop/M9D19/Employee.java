public class Employee {

    private String name = "";
    private String id = "";
    private String gender = "";

    public Employee(String name, String id, String gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("zoe", "101", "female");
        Employee e2 = new Employee("jack", "101", "female");
        Employee e3 = new Employee("fufu", "101", "female");


        System.out.println("e1.name=" + e1.getName());
        System.out.println("e1.id=" + e1.getId());
        System.out.println("e1.gender=" + e1.getGender());

        e1.setName("haha");
        e1.setId("12321");
        e1.setGender("male");
        System.out.println("实例域已经修改");
        System.out.println("e1.name=" + e1.getName());
        System.out.println("e1.id=" + e1.getId());
        System.out.println("e1.gender=" + e1.getGender());

        System.out.println("e1=" + e1);
        System.out.println("e2=" + e2);
        System.out.println("e3=" + e3);
    }
}
