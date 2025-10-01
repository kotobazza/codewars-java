package test.java.com.codewarstasks;

import org.junit.jupiter.api.Test;

import static main.java.com.codewarstasks.Isograms.isIsogram;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/// Is this string an isogram?
/// + Isogram - the string contains symbols meeting only one time in whole string
///   + Strings without repeating symbols
///
public class IsogramsTest {

    @Test
    public void testEmptyString(){
        assertTrue(isIsogram(""));
    }

    @Test
    public void testNotIsogram(){
        assertFalse(isIsogram("moose"));
    }

    @Test
    public void testTrueIsogram(){
        assertTrue(isIsogram("Dermatoglyphics"));
    }
}
