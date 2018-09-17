package M9D12;

/**
 * 算出从1到100中奇数相加的结果，并打印到控制台
 */

class Quiz6 extends Quiz{
    void show() {
        System.out.println("现在运行的是实验6--------");
        int i =1;
        int sum = 0;
        while (i < 100) {
            if (i%2 == 0) {
                i++;
                continue;
            }else {
                sum+=i;
                i++;
            }
        }
        System.out.println(sum);
        System.out.println("实验6展示完成--------");
    }
}
