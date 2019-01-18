package exercises.week8Robomimie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AmpersandRemoverAndReverserTest {
    private AmpersandRemoverAndReverser ampersandRemoverAndReverser = new AmpersandRemoverAndReverser();

    @Test
    void testCanDecrypt() {
        boolean canDecryptWith = ampersandRemoverAndReverser.canDecrypt("&&A&min");
        Assertions.assertTrue(canDecryptWith, String.valueOf(true));
    }

    @Test
    void testCanDecryptcase2() {
        boolean canDecryptWithout = ampersandRemoverAndReverser.canDecrypt("amin");
        Assertions.assertFalse(canDecryptWithout, String.valueOf(false));

    }

    @Test
    void decrypt() {
        String decrypt = ampersandRemoverAndReverser.decrypt("&Amin");

        Assertions.assertEquals("nimA", decrypt);
    }
}