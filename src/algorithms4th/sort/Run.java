package algorithms4th.sort;

import algorithms4th.insertion.InsertionKt;

import java.util.Scanner;

public class Run {

    //private static Insertion i = new Insertion();
    private static InsertionKt i = new InsertionKt();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = new String[5];
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.next();
        }
        i.sort(a);
        assert i.isSorted(a);
        i.show(a);
    }
}
