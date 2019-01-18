package exercises.week3Traits.ex04MessageEncrypting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MessengerTest {
    private Decryptor decryptor = new Decryptor();

    @Test
    void testDecryptor() {
        String mahnaz = decryptor.decrypt("M-*%4&h!n4z");

        String expected = "Mahnaz";

        Assertions.assertEquals(expected, mahnaz);
    }
}