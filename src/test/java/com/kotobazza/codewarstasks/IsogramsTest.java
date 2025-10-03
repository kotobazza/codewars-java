package com.kotobazza.codewarstasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/// Is this string an isogram?
/// + Isogram - the string contains symbols meeting only one time in whole string
///   + Strings without repeating symbols
///
public class IsogramsTest {

    @Test
    public void testEmptyString(){
        assertTrue(Isograms.isIsogram(""));
    }

    @Test
    public void testNotIsogram(){
        assertFalse(Isograms.isIsogram("moose"));
    }

    @Test
    public void testTrueIsogram(){
        assertTrue(Isograms.isIsogram("Dermatoglyphics"));
    }
}
