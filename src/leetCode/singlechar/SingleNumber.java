package leetCode.singlechar;

import java.util.Arrays;

/**
 * Created by young on 2017/8/21.
 */
public class SingleNumber {
    public static void main(String[] args) {
        char[] nums = new char[]{'a', 'a', 'b'};
        System.out.println(singleChar(nums));
    }

    private static char singleChar(char[] chars) {
        int ans = 0;
        for (int aChar : chars) {
            ans ^= aChar;
        }
        return (char) ans;
    }
}
