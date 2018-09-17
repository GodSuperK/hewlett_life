package M9D12;

/**
 * 在控制台打印出个人基本信息，要求用变量对个人信息进行存储
 *
 * @author 孔德成
 * @version 1.0
 */
class Quiz1 extends Quiz{
    void show() {
        System.out.println("现在运行的是实验1--------");
        String name = "孔德成";
        char gender = '男';
        int age = 22;
        String subject = "JAVA开发";
        System.out.println("姓名：" + name + "性别：" + gender + "年龄：" + age + "专业：" + subject);
        System.out.println("实验1展示完成--------");
    }
}
