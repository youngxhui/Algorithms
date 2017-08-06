package leetCode._469;

public class Solution {
    public static void main(String[] args) {
        int[] findNums = new int[]{2, 4};
        int[] nums = new int[]{1, 2, 3, 4};
        int out[] = nextGreaterElement(findNums, nums);
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }


    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] out = new int[findNums.length];
        for (int i = 0; i < findNums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (findNums[i] == nums[j]) {
                    for (int k = 1; k < nums.length - j; k++) {
                        if (j + 1 < nums.length && findNums[i] < nums[j + k]) {
                            out[i] = nums[j + k];
                            findNums[i] = 0;
                            break;
                        }
                    }
                    if (findNums[i] != 0) {
                        out[i] = -1;
                        break;
                    }
                }
            }
        }
        return out;
    }
}
