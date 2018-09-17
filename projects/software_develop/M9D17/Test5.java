package M9D17;

import java.util.Arrays;

/**
 * 数组元素逆序 (就是把元素对调)
 * 1. 正序 Arrays.sort()
 * 2. 反序迭代 构建新数组
 * 3. 重新引用构建好的数组
 */
public class Test5 {
    public static void main(String[] args) {
        int[] aNumbers = Arrays.copyOf(Test4.aNumbers, Test4.aNumbers.length);
        // step 1
        Arrays.sort(aNumbers); // 排序
        System.out.println("正序：" + Arrays.toString(aNumbers));

        // step 2
        int[] bNumbers = new int[aNumbers.length];
        int j = 0;
        for (int i = aNumbers.length - 1; i >= 0; i--) {
            bNumbers[j] = aNumbers[i];
            j++;
        }
        // step 3
        aNumbers = bNumbers;

        System.out.println("反序：" + Arrays.toString(aNumbers));
    }
}
