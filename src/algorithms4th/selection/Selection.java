package algorithms4th.selection;

import algorithms4th.sort.Base;

public class Selection extends Base {
    /**
     * 选择排序的两个特点
     * 1. 和输入的数据无关，时间复杂度是一样的 O=N^2/2
     * 2. 数据移动最少的    N
     *
     * @param a 所要排序的数组
     */
    @Override
    public void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
                exch(a, i, min);
            }
        }
    }
}
