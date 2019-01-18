package exercises.week3Traits.ex04MessageEncrypting;

public class Messenger {
    private Encryptor encryptor = new Encryptor();
    private Decryptor decryptor = new Decryptor();

    public String sendMessage(String message) {

        String encrypted = encryptor.encrypt(message);
        return encrypted;
    }

    public String receiveMessage(String message) {
        String decrypted = decryptor.decrypt(message);
        return decrypted;
    }
}
