package exercises.week8Robomimie;

public class HashtagsAndRobomimesRemover implements Decryptor {


    @Override
    public boolean canDecrypt(String line) {
        return line.contains("#");
    }

    @Override
    public String decrypt(String line) {
        String noHash = line.replace("#", "");
        String noRobomime = noHash.replace("robomime", "");
        return noRobomime;
    }
}



