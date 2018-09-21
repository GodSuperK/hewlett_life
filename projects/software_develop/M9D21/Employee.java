package M9D21;

public class Employee {
    private static String COMPANY = "阿里";
    private String name;
    private int memNumber;

    public Employee() {
    }

    public Employee(String name, int memNumber) {
        this.name = name;
        this.memNumber = memNumber;
    }

    public static String getCOMPANY() {
        return COMPANY;
    }

    public static void setCOMPANY(String COMPANY) {
        Employee.COMPANY = COMPANY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemNumber() {
        return memNumber;
    }

    public void setMemNumber(int memNumber) {
        this.memNumber = memNumber;
    }

    public static String getCompany() {
        return Employee.COMPANY;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", memNumber='" + memNumber + '\'' +
                '}';
    }
}
