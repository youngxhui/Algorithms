package algorithms4th.selection;

import java.util.Scanner;

public class SelectionTest {

    private static Selection s = new Selection();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = new String[5];
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.next();
        }
        s.sort(a);
        assert s.isSorted(a);
        s.show(a);
    }
}
