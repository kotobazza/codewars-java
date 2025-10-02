package test.java.com.kotobazza.codewarstasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static main.java.com.kotobazza.codewarstasks.NumberedStrings.numberStrings;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;


/// Given the array of strings, concatenate each string with its number like `1: string`
///
public class NumberedStringsTest {

    @Test
    public void testEmptyArray(){
        assertIterableEquals(List.of(), numberStrings(List.of()));
    }

    @Test
    public void testNonEmptyStringsEnumeration(){
        assertIterableEquals(Arrays.asList("1: a", "2: b", "3: c"), numberStrings(Arrays.asList("a", "b", "c")));
    }

    @Test
    public void testEmptyStringsEnumeration(){
        assertIterableEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), numberStrings(Arrays.asList("", "", "", "", "")));
    }
}
