package sort;

import java.util.Scanner;

public class Example {

    public static void sort(Comparable[] a) {

    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = a[i];
    }

    private static void show(Comparable[] a) {
        for (Comparable anA : a) {
            System.out.println(anA);
        }
    }

    private static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = new String[5];
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.next();
        }
        sort(a);
        assert isSorted(a);
        show(a);
    }

}
