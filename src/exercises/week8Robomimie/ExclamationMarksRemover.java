package exercises.week8Robomimie;

import java.util.ArrayList;
import java.util.List;

public class ExclamationMarksRemover implements Decryptor {

    @Override
    public boolean canDecrypt(String line) {
        return line.contains("!");
    }

    @Override
    public String decrypt(String line) {
        String noExclamation = line.replace("!", "");
        return noExclamation;
    }
}
