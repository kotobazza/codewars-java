package test.java.com.kotobazza.codewarstasks;

import main.java.com.kotobazza.codewarstasks.Diamond;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



/// Return a diamond figure into console
public class DiamondTest {

    @Test
    public void testFromKata(){
        assertEquals(
        " *\n" +
                 "***\n" +
                 " *\n",
                Diamond.print(3)
        );

        assertEquals(
        "  *\n" +
                 " ***\n" +
                 "*****\n" +
                 " ***\n" +
                 "  *\n",
                Diamond.print(5)
        );



        assertEquals(
        "       *\n" +
                 "      ***\n" +
                 "     *****\n" +
                 "    *******\n" +
                 "   *********\n" +
                 "  ***********\n" +
                 " *************\n" +
                 "***************\n" +
                 " *************\n" +
                 "  ***********\n" +
                 "   *********\n" +
                 "    *******\n" +
                 "     *****\n" +
                 "      ***\n" +
                 "       *\n",
                Diamond.print(15));
    }
}
