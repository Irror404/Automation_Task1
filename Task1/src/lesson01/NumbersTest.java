package lesson01;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class NumbersTest {
    @Test
    void sumPositiveTest() {
        Numbers numbers = new Numbers(3, 2);
        Assertions.assertEquals(5, numbers.getSum());
    }

    @Test
    void diffPositiveTest() {
        Numbers numbers = new Numbers(8, 6);
        Assertions.assertEquals(2, numbers.getDiff());
    }

    @Test
    void multiplicationPositiveTest() {
        Numbers numbers = new Numbers(3, 4);
        Assertions.assertEquals(12, numbers.getMulti());
    }

    @Test
    void divPositiveTest() {
        Numbers numbers = new Numbers(18, 2);
        Assertions.assertEquals(9, numbers.getDiv());
    }
}
