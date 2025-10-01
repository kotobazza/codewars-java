package test.java.com.codewarstasks;

import org.junit.jupiter.api.Test;

import static main.java.com.codewarstasks.ExesAndOs.exesAndOs;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExesAndOsTest {

    @Test
    public void testEqualOX(){
        assertTrue(exesAndOs("ooxx"));
    }

    @Test
    public void testInequalOX(){
        assertFalse(exesAndOs("xooxx"));
    }

    @Test
    public void testStringWithManyChars(){
        assertFalse(exesAndOs("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testEmptyString(){
        assertTrue(exesAndOs(""));
    }
}
