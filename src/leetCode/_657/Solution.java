package leetCode._657;

/**
 * Created by young on 2017/8/16.
 */
public class Solution {
    public boolean judgeCircle(String moves) {
        int lCount = 0;
        int rCount = 0;
        int dCount = 0;
        int uCount = 0;
        char step[] = moves.toCharArray();
        for (char aStep : step) {
            switch (aStep) {
                case 'L':
                    lCount++;
                    break;
                case 'R':
                    rCount++;
                    break;
                case 'U':
                    uCount++;
                    break;
                case 'D':
                    dCount++;
                    break;
            }
        }
        return lCount == rCount && uCount == dCount;
    }
}
