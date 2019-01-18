package exercises.week4DateStructure.ex10File;

import exercises.week4DateStructure.ex07Map.Topic;

import java.util.HashSet;
import java.util.List;

public class TopicReaderApplication {
    public static void main(String[] args) {

        TopicReader topicReader = new TopicReader();
        List<Topic> topics = topicReader.getTopics();
        for (Topic topic : topics) {
            System.out.println("Topic list: " + topic);
        }
        HashSet<Topic> newTopics = new HashSet<>(topics);
        for (Topic newTopic : newTopics) {
            System.out.println("Topic set: " + newTopic);
        }
        System.out.println("Size of List: " + topics.size());
        System.out.println("Size of set: " + newTopics.size());
    }
}
