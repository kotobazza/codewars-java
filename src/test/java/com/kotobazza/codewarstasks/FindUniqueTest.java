package com.kotobazza.codewarstasks;

import org.junit.jupiter.api.Test;

import static main.java.com.kotobazza.codewarstasks.FindUnique.findUniqByTreeMap;
import static main.java.com.kotobazza.codewarstasks.FindUnique.findUniqueByTwoLists;
import static org.junit.jupiter.api.Assertions.assertEquals;


/// Given an array containing many elements of two numbers find a unique one
/// [1.0, 1.0, 1.0, 4.5]
///
public class FindUniqueTest {
    private final double precision = 0.0000000000001;

    @Test
    public void test1(){

        assertEquals(1.0, findUniqByTreeMap(new double[]{0, 1, 0}), precision);
        assertEquals(1.0, findUniqueByTwoLists(new double[]{0, 1, 0}), precision);
    }

    @Test
    public void test2(){
        assertEquals(2.0, findUniqByTreeMap(new double[]{1, 1, 1, 2, 1, 1}), precision);
        assertEquals(2.0, findUniqueByTwoLists(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }
}
