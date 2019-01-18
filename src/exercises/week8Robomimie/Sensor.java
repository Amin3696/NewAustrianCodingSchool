package exercises.week8Robomimie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sensor {

    private TextReader textReader = new TextReader();
    private HashtagsAndRobomimesRemover hashtagsAndRobomimesRemover = new HashtagsAndRobomimesRemover();
    private AmpersandRemoverAndReverser ampersandRemoverAndReverser = new AmpersandRemoverAndReverser();
    private ExclamationMarksRemover exclamationMarksRemover = new ExclamationMarksRemover();
    private List<Decryptor> decryptAgentsList = Arrays.asList(hashtagsAndRobomimesRemover, ampersandRemoverAndReverser, exclamationMarksRemover);

    public List<String> returnCleanTricks() {

        List<String> lines = textReader.readText();
        List<String> cleanedLines = cleanLines(lines);
        return cleanedLines;
    }

    public List<String> cleanLines(List<String> lines) {

        List<String> cleanTricks = new ArrayList<>();
        for (String line : lines) {
            Optional<String> trick = decrypt(line);
            cleanTricks.add(trick.get());
        }
        return cleanTricks;
    }

    Optional<String> decrypt(String line) {

        String decryptedLine = "";
        for (Decryptor decryptor : decryptAgentsList) {
            if (decryptor.canDecrypt(line)) {
                decryptedLine = decryptor.decrypt(line);
                return Optional.of(decryptedLine);
            }
        } return Optional.empty();
    }
}
