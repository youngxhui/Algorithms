package leetCode.distributeCandies;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] candies = new int[]{1, 2, 1, 2, 3, 3};
        System.out.println(distributeCandies(candies));
    }

    public static int distributeCandies(int[] candies) {
        List<Integer> list = new ArrayList<>();
        for (int candy : candies) {
            list.add(candy);
        }
        Set<Integer> set = new HashSet<>(list);
        return set.size() > candies.length / 2 ? candies.length / 2 : set.size();
    }
}
