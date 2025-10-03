package com.kotobazza.codewarstasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/// Maskify text with "#" except last 4 symbols
///
public class TextMaskifyTest {

    @Test
    public void testLongString(){
        assertEquals("######7890", TextMaskify.maskify("1234567890"));
    }

    @Test
    public void testShortString(){assertEquals("123", TextMaskify.maskify("123"));}

    @Test
    public void testEmptyString(){
        assertEquals("", TextMaskify.maskify(""));
    }
}
