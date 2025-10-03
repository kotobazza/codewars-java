package com.kotobazza.codewarstasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/// Find the shortest word in string and return it's size
/// There's asserted that string won't be empty
public class ShortestWordsTest {
    @Test
    public void testManyWords1(){
        assertEquals(3, ShortestWords.findShortestWordLength("bitcoin take over the world maybe who knows perhaps"));
    }

    @Test
    public void testManyWords2(){
        assertEquals(3, ShortestWords.findShortestWordLength("turns out random test cases are easier than writing out basic ones"));

    }
}
