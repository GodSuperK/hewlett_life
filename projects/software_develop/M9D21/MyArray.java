package M9D21;

import java.util.Arrays;

/**
 * 只提供了 int 数组的接口
 * 需要其他类型的数组接口只需要重载已经定义好的方法即可
 */
public class MyArray {

    public static int maxValue(int[] array) {
        int max_value = array[0];
        for (int i : array) {
            max_value = max_value >= i ? max_value : i;
        }
        return max_value;
    }

    public static int minValue(int[] array) {
        int min_value = array[0];
        for (int i : array) {
            min_value = min_value <= i ? min_value : i;
        }
        return min_value;
    }

    public static int len(int[] array) {
        return array.length;
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void show(int[] array) {
        System.out.println(Arrays.toString(array));
    }


}
