package week.homework;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

/**
 * Created by young on 2017/4/18.
 */
public class Percolation {

    int count = 0;

    //create n-by-n grid, with all sites blocked
    public Percolation(int n) {
        if (n < 0) {
            throw new IndexOutOfBoundsException();
        }
        count = n;
        int[][] maps = new int[n][n];


    }

    //open site (row, col) if it is not open already
    public void open(int row, int col) {

        if (isOpen(row, col)) {
            return;
        }

        numberOfOpenSites();
    }

    //is site (row, col) open?
    public boolean isOpen(int row, int col) {
//        if (a[row][col]==1){
//            return true;
//        }
        return false;
    }

    //number of open sites
    public int numberOfOpenSites() {

        return 0;
    }

    //does the system percolate?
    public boolean percolates() {

        return true;
    }

    public static void main(String[] args) {

    }
}
