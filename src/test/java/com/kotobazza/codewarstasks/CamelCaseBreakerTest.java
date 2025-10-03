package com.kotobazza.codewarstasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/// Break string in camel case on each Upper Letter
///
public class CamelCaseBreakerTest {

    @Test
    public void testOneWord(){
        assertEquals("Insomnia", CamelCaseBreaker.breakCamelCase("Insomnia"));
    }

    @Test
    public void testCamelCaseOne(){
        assertEquals("camel Case", CamelCaseBreaker.breakCamelCase("camelCase"));

    }

    @Test
    public void testCamelCaseTwo(){
        assertEquals("camel Casing Test", CamelCaseBreaker.breakCamelCase("camelCasingTest"));

    }

    @Test
    public void testWithoutCamelCase(){
        assertEquals("camelcasingtest", CamelCaseBreaker.breakCamelCase("camelcasingtest"));
    }
}
