import java.util.Arrays;
import java.util.Stack;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr , 3);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int d) {
        d = d%nums.length;
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[(i + d) % nums.length];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}
