package com.kotobazza.codewarstasks;

import org.junit.jupiter.api.Test;

import static main.java.com.kotobazza.codewarstasks.SimpleCypher1.encrypt;
import static org.junit.jupiter.api.Assertions.assertEquals;


/// Simple Cypher
/// 1. Your message is a string containing space separated words.
/// 2. The first letter must be converted to its ASCII code.
/// 3. The second letter must be switched with the last letter
/// 4. Keepin' it simple: There are no special characters in the input.
///
/// Decryption should restore the old string
/// + Decryption wasn't implemented due to no task on CodeWars for Java
public class SimpleCypher1Test {

    @Test
    public void testEncryption(){
        assertEquals("72olle", encrypt("Hello"));
        assertEquals("104olle 119drlo", encrypt("hello world"));
        assertEquals("65 119esi 111dl 111lw 108dvei 105n 97n 111ka", encrypt("A wise old owl lived in an oak"));
        assertEquals("87yh 99na 119e 110to 97ll 98e 108eki 116tah 119esi 111dl 98dri", encrypt("Why can we not all be like that wise old bird"));
    }
}
