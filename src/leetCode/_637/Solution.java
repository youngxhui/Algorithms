package leetCode._637;

import leetCode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public static void main(String[] args) {
        //

//        int[] a = new int[]{3, 9, 20, 15, 7, 0, 0};
    }

    /**
     * 测试数据
     * Input:
     * 3
     * / \
     * 9  20
     * / \
     * 15 7
     * Output: [3, 14.5, 11]
     * 3 9 20 15 7
     *
     * @param root
     * @return
     */


    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) return result;
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();// n = 5
            double sum = 0.0;
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();  //queue: 9 20 15 7
                sum += node.val;
                if (node.left != null) q.offer(node.left); // queue 9 20 15 7 9
                if (node.right != null) q.offer(node.right); //queue 9 20 15 7 9 20
            }
            result.add(sum / n); //result 3/5
        }
        return result;
    }
}