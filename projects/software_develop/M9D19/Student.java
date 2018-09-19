public class Student {

    private String sNO = "";
    private String sName = "";
    private String sSex = "";
    private int sAge = 0;
    private double sJava = 0;

    public Student(String sNO, String sName, String sSex, int sAge, double sJava) {
        this.sNO = sNO;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }

    public static void main(String[] args) {
        Student stu1 = new Student("1001", "Jack", "male", 20, 100);
        Student stu2 = new Student("1002", "Rose", "male", 20, 80);
        Student stu3 = new Student("1003", "Kali", "male", 20, 70);
        Student stu4 = new Student("1004", "Bob", "male", 20, 99.5);
        Student stu5 = new Student("1005", "Mike", "male", 20, 88.8);
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);
        System.out.println(stu4);
        System.out.println(stu5);

        Student[] students = {stu1, stu2, stu3, stu4, stu5};
        double totalScore = 0;
        double maxScore = students[0].getsJava();
        double minScore = students[0].getsJava();
        for (Student stu : students) {
            totalScore += stu.getsJava();
            maxScore = maxScore > stu.getsJava() ? maxScore : stu.getsJava();
            minScore = minScore < stu.getsJava() ? minScore : stu.getsJava();
        }

        System.out.println("平均成绩:" + totalScore / 5);
        System.out.println("最大成绩" + maxScore);
        System.out.println("最小成绩" + minScore);
    }

    public String getsNO() {
        return sNO;
    }

    public void setsNO(String sNO) {
        this.sNO = sNO;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public double getsJava() {
        return sJava;
    }

    public void setsJava(double sJava) {
        this.sJava = sJava;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sNO='" + sNO + '\'' +
                ", sName='" + sName + '\'' +
                ", sSex='" + sSex + '\'' +
                ", sAge=" + sAge +
                ", sJava=" + sJava +
                '}';
    }
}
