package com.kotobazza.codewarstasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/// Reorder words in accordance with a number inserted into this word
///
/// Guaranteed the right numbers in each word and possible right order
///
public class WordSorterTest {

    @Test
    public void testEmptyString(){
        assertEquals("", WordSorter.order(""));
    }

    @Test
    public void testNonEmptyString(){
        assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", WordSorter.order("4of Fo1r pe6ople g3ood th5e the2"));
    }
}
