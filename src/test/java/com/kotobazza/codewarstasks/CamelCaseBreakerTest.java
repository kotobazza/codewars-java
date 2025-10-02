package test.java.com.kotobazza.codewarstasks;

import org.junit.jupiter.api.Test;

import static main.java.com.kotobazza.codewarstasks.CamelCaseBreaker.breakCamelCase;
import static org.junit.jupiter.api.Assertions.assertEquals;

/// Break string in camel case on each Upper Letter
///
public class CamelCaseBreakerTest {

    @Test
    public void testOneWord(){
        assertEquals("Insomnia", breakCamelCase("Insomnia"));
    }

    @Test
    public void testCamelCaseOne(){
        assertEquals("camel Case", breakCamelCase("camelCase"));

    }

    @Test
    public void testCamelCaseTwo(){
        assertEquals("camel Casing Test", breakCamelCase("camelCasingTest"));

    }

    @Test
    public void testWithoutCamelCase(){
        assertEquals("camelcasingtest", breakCamelCase("camelcasingtest"));
    }
}
