package exercises.week8Robomimie;

public class AmpersandRemoverAndReverser implements Decryptor {

    @Override
    public boolean canDecrypt(String line) {
        return line.contains("&");
    }


    @Override
    public String decrypt(String line) {
        String noAmpersand = line.replace("&", "");
        String reversed = new StringBuilder(noAmpersand).reverse().toString();

        return reversed;
    }
}
