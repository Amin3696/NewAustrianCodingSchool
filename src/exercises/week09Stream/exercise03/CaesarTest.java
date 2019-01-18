package exercises.week09Stream.exercise03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.crypto.Cipher;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {
    private Caesar caesar = new Caesar();

    @Test
    void testCipher() {
        String hello = caesar.cipher("HELLO", 1);
        String expected = "IFMMP";

        Assertions.assertEquals(expected, hello);

    }

    @Test
    void testCipherBeSure() {
        String hello = caesar.cipher("be sure to drink your Ovaltine", 13);
        String expected = "or fher gb qevax lbhe Binygvar";

        Assertions.assertEquals(expected, hello);

    }

    @Test
    void testCipherHelloWord() {
        String hello = caesar.cipher("hello, world", 13);
        String expected = "uryyb, jbeyq";

        Assertions.assertEquals(expected, hello);

    }
}