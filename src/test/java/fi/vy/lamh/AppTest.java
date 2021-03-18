package fi.vy.lamh;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static fi.vy.lamh.App.*;
import org.junit.Test;

import jdk.jfr.Timestamp;

/**
 * Unit test for simple 
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
        assertEquals(1.33, divide(4,3), .2);
        assertEquals(0, divide(0,1), .2);
        assertEquals(Double.NaN, divide(1,0), .2);
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
        assertEquals(Double.valueOf(1.33), div(new Double(4), new Double(3)), .2);
        assertEquals(Double.valueOf(33), div(new Double(99), new Double(3)), .2);
        //assertEquals(Double.valueOf(null), div(new Double(null), new Double(3)), .2);
        //assertEquals(Double.valueOf(null), div(new Double(3), new Double(null)), .2);
        //assertEquals(Double.valueOf(null), div(new Double(3), new Double(0)), .2);
    }
}
