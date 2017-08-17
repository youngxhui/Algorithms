package leetCode._485;

/**
 * Created by young on 2017/8/16.
 */
public class Solution {
    private static int findMaxConsecutiveOnes(int[] nums) {
        int length = 0;
        int a = 0;
        for (int num : nums) {
            if (num == 1) {
                length++;
                a = Math.max(a, length);
            } else {
                length = 0;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, 0, 1, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
