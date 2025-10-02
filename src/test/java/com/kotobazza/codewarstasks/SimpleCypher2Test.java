package test.java.com.kotobazza.codewarstasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static main.java.com.kotobazza.codewarstasks.SimpleCypher2.encrypt;
import static main.java.com.kotobazza.codewarstasks.SimpleCypher2.decrypt;

/// Cypher v2
///
/// Use odd and even symbols to return string {odd}{even} for some times
public class SimpleCypher2Test {

    @Test
    public void testEncryptionFromKata(){
        assertEquals("This is a test!", encrypt("This is a test!", 0));
        assertEquals("hsi  etTi sats!", encrypt("This is a test!", 1));
        assertEquals("s eT ashi tist!", encrypt("This is a test!", 2));
        assertEquals(" Tah itse sits!", encrypt("This is a test!", 3));
        assertEquals("This is a test!", encrypt("This is a test!", 4));
        assertEquals("This is a test!", encrypt("This is a test!", -1));
    }

    @Test
    public void testDecryptionFromKata(){
        assertEquals("This is a test!", decrypt("This is a test!", 0));
        assertEquals("This is a test!", decrypt("hsi  etTi sats!", 1));
        assertEquals("This is a test!", decrypt("s eT ashi tist!", 2));
        assertEquals("This is a test!", decrypt(" Tah itse sits!", 3));
        assertEquals("This is a test!", decrypt("This is a test!", 4));
        assertEquals("This is a test!", decrypt("This is a test!", -1));
        assertEquals("This kata is very interesting!", decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
    }

}
