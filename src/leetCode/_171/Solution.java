package leetCode._171;

/**
 * Created by young on 2017/8/21.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(titleToNumber("BA"));
    }

    private static int titleToNumber(String s) {
        int len = s.length();
        int col = 0;
        char[] c = s.toCharArray();
        for (int i = len - 1; i > 0; i--) {
            col += 26 * i * (c[i] - 65);
        }
        return col + c[0] - 64;
    }
}
