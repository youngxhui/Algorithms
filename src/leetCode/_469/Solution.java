package leetCode._469;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] findNums = new int[]{2, 4, 3};
        int[] nums = new int[]{1, 4, 3, 5};
        int out[] = nextGreaterElement(findNums, nums);
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }


    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
}
