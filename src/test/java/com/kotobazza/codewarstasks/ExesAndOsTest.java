package com.kotobazza.codewarstasks;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/// Check is string containing the equal number of 'x's and 'o's
///
public class ExesAndOsTest {

    @Test
    public void testEqualOX(){
        assertTrue(ExesAndOs.exesAndOs("ooxx"));
    }

    @Test
    public void testInequalOX(){
        assertFalse(ExesAndOs.exesAndOs("xooxx"));
    }

    @Test
    public void testStringWithManyChars(){
        assertFalse(ExesAndOs.exesAndOs("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testEmptyString(){
        assertTrue(ExesAndOs.exesAndOs(""));
    }
}
