package exercises.week4DateStructure.ex10File;

import exercises.week4DateStructure.ex07Map.Topic;
import exercises.week4DateStructure.ex09File.FileReader;

import java.util.ArrayList;
import java.util.List;

public class TopicReader {
    private FileReader fileReader = new FileReader();

    public List<Topic> getTopics() {
        List<String> lines = readFile();
        List<Topic> topics = transferToTopic(lines);
        return topics;
    }

    private List<String> readFile() {
        List<String> lines = fileReader.asList("exercises/week4DateStructure/ex10File/topics.txt");
        return lines;
    }

    private List<Topic> transferToTopic(List<String> lines) {
        ArrayList<Topic> topics = new ArrayList<>();
        for (String line : lines) {
            Topic newTopic = new Topic(line);
            topics.add(newTopic);
        }
        return topics;
    }
}
