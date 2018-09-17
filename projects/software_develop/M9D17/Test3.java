package M9D17;

/**
 * 实验三：数组遍历(依次输出数组中的每一个元素)
 * 1. for
 * 2. foreach
 * 3. while
 */
public class Test3 {
    private static final String[] WEEK = {
            "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday",
            "Sunday"
    };

    public static void main(String[] args) {
        toForLoop(WEEK);
        toForEachLoop(WEEK);
        toWhileLoop(WEEK);
    }
    private static void toForLoop(String[] array) {
        System.out.print("\nResult of for loop:\n\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    private static void toForEachLoop(String[] array) {
        System.out.print("\nResult of foreach loop:\n\t");
        for (String i: array) {
            System.out.print(i+" ");
        }
    }
    private static void toWhileLoop(String[] array) {
        System.out.print("\nResult of while loop:\n\t");
        int i = 0;
        while (i!=array.length) {
            System.out.print(array[i]+" ");
            i++;
        }
    }

}
