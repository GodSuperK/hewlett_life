package M9D21;

public class TestMyArray {
    public static void main(String[] args) {
        int[] aArray = {10, 8, 23, 5};
        System.out.println("最大值：" + MyArray.maxValue(aArray));
        System.out.println("最小值" + MyArray.minValue(aArray));
        System.out.println("数组长度：" + MyArray.len(aArray));
        // sort
        MyArray.sort(aArray);
        MyArray.show(aArray);
    }
}
