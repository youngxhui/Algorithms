package leetCode.keyboardRow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Solution {


    public static void main(String[] args) {
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words)));
        System.out.println(findWords(words));
    }

    public static String[] findWords(String[] words) {
//        int count = 0;
        List<String> st = new ArrayList<>();
        int sums = 0;
        //匹配规则
        String[] key = new String[]{"[qwertyuiopQWERTYUIOP]", "[ASDFGHJKLasdfghjkl]", "[zxcvbnmZXCVBNM]"};
        //匹配字符串
        for (int i = 0; i < words.length; i++) {
            char[] c = words[i].toCharArray();
            int sum = 0;
            int count = 0;
            for (int k = 0; k < key.length; k++) {
                for (int j = 0; j < c.length; j++) {

                    if (Pattern.matches(key[k], String.valueOf(c[j]))) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
            if (count == c.length) {
                st.add(words[i]);
            }
        }
        String[] str = st.toArray(new String[st.size()]);
        String arr = Arrays.toString(str);
        String[] out = new String[1];
        out[0] = arr;
        return out;
    }


}
