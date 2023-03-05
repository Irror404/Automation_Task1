package lesson01;

import junit.framework.Assert;
import org.junit.Test;

public class NumbersTest {
    private Assert Assertions;

    @Test
    void testSumPositive() {
        Numbers numbers = new Numbers(2, 2);

        Assertions.assertEquals(4, numbers.getSum());
    }
    @Test
    void testDiffPositive() {
        Numbers numbers = new Numbers(4, 2);

        Assertions.assertEquals(2, numbers.getDiff());
    }
    @Test
    void testMultiplicationPositive() {
        Numbers numbers = new Numbers(3, 3);

        Assertions.assertEquals(9, numbers.getMulti());
    }
    @Test
    void testDivPositive() {
        Numbers numbers = new Numbers(1, 1);

        Assertions.assertEquals(1, numbers.getDiv());
    }
}
