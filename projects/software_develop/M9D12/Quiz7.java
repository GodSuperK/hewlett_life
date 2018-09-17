package M9D12;

/**
 * 使用for循环语句打印九九乘法表
 */
class Quiz7 extends Quiz{
    void show() {
        System.out.println("现在运行的是实验7--------");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"x"+i+"="+(i*j)+" ");
            }
            System.out.println();
        }
        System.out.println("实验7展示完成--------");
    }
}
