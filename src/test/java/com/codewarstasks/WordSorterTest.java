package test.java.com.codewarstasks;

import org.junit.jupiter.api.Test;

import static main.java.com.codewarstasks.WordSorter.order;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordSorterTest {

    @Test
    public void testEmptyString(){
        assertEquals("", order(""));
    }

    @Test
    public void testNonEmptyString(){
        assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", order("4of Fo1r pe6ople g3ood th5e the2"));
    }
}
