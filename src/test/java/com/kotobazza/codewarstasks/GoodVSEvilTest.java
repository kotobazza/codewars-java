package com.kotobazza.codewarstasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/// There's powers of Good and Evil defined in the solving class
///
/// Task is to check by the amount of warriors what side should win
///

public class GoodVSEvilTest {
    @Test
    public void test1(){
        assertEquals("Battle Result: Evil eradicates all trace of Good", GoodVSEvil.battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));
    }

    @Test
    public void test2(){
        assertEquals("Battle Result: Good triumphs over Evil", GoodVSEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
    }

    @Test
    public void test3(){
        assertEquals("Battle Result: No victor on this battle field", GoodVSEvil.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
    }
}
