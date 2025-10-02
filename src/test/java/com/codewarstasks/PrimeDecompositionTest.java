package test.java.com.codewarstasks;

import org.junit.jupiter.api.Test;

import static main.java.com.codewarstasks.PrimeDecomposition.factors;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeDecompositionTest {
    @Test
    public void test1(){
        assertEquals("(2**2)(3**3)(5)(7)(11**2)(17)", factors(7775460));
    }
    @Test
    public void test2(){
        assertEquals("(2**5)(5)(7**2)(11)", factors(86240));
    }
}
