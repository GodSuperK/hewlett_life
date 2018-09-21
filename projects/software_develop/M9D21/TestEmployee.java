package M9D21;

public class TestEmployee {
    public static void main(String[] args) {
        String[] names = {"rose", "bob", "jack", "khalid", "cc"};
        Employee[] e = new Employee[5];
        for (int i = 0; i < e.length; i++) {
            e[i] = new Employee(names[i], i);
        }
        for (Employee i : e) {
            System.out.println(i.toString());
        }
        System.out.println(Employee.getCOMPANY());
    }
}
