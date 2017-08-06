package leetCode._463;

public class Solution {
    public static int islandPerimeter(int[][] grid) {
//        int perimeter = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == 1) {
//                    perimeter += 4;
//                    if (j - 1 >= 0 && grid[i][j - 1] == 1) perimeter -= 2;
//                    if (i - 1 >= 0 && grid[i - 1][j] == 1) perimeter -= 2;
//                }
//            }
//        }
//        return perimeter;
        int p = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    p += 4;
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        p -= 2;
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        p -= 2;
                    }
                }
            }
        }
        return p;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}
        };
        System.out.println(islandPerimeter(grid));

    }
}
