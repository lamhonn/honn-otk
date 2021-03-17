package fi.vy.lamh;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jdk.jfr.Timestamp;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testAdd() {
        assertEquals(10, add(6,4));
        assertEquals(0, add(0,0));
        assertEquals(0, add(-6,6));
    }

    @Test
    public void testDivide() {
        assertEquals(1.33, divide(4,3));
        assertEquals(0, divide(0,1));
        assertEquals(NaN, divide(1,0));
    }

    @Test
    public void testReturnTwoChars() {
        assertEquals("qw", returnTwoChars("qwerty"));
        assertEquals("VA", returnTwoChars("VA"));
        assertEquals("V", returnTwoChars("V"));
        assertEquals("", returnTwoChars(""));
        assertEquals(null, returnTwoChars(null));
    }

    @Test
    public void testDiv() {
        assertEquals(1.33, div(new Double(4), new Double(3)));
        assertEquals(33, div(new Double(99), new Double(3)));
        assertEquals(null, div(null, new Double(3)));
        assertEquals(null, div(new Double(3), null));
        assertEquals(null, div(new Double(3), new Double(0)));
    }
}
