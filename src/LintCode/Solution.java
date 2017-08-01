package LintCode;

import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 4, 5, 5};
        //‭01011101‬  ‭01001001‬
        int pos = findPosition(nums, 6);
        System.out.println(pos);
    }

    /**
     * @param nums:   An integer array sorted in ascending order
     * @param target: An integer
     * @return an integer
     */
    public static int findPosition(int[] nums, int target) {
        // Write your code here
        int pos = Arrays.binarySearch(nums, target);
        if (pos < 0) {
            pos = -1;
        }
        return pos;
    }
}
