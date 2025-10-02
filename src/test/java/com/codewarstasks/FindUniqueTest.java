package test.java.com.codewarstasks;

import org.junit.jupiter.api.Test;

import static main.java.com.codewarstasks.FindUnique.findUniqByTreeMap;
import static main.java.com.codewarstasks.FindUnique.findUniqueByTwoLists;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
