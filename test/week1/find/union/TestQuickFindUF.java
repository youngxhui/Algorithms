package week1.find.union;

import org.junit.Test;

/**
 * Created by young on 2017/4/13.
 */
public class TestQuickFindUF {
    @Test
    public void testQFUF(){
        QuickFindUF quickFindUF = new QuickFindUF(5);
        quickFindUF.union(1, 2);
        boolean result=quickFindUF.connected(1, 2);
        System.out.println("result = " + result);
    }
}
