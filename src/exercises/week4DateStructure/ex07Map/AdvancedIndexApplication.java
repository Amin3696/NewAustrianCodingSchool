package exercises.week4DateStructure.ex07Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AdvancedIndexApplication {
    public static void main(String[] args) {
        HashMap<Integer, List<Topic>> index = new HashMap<>();
        Integer page1 = 1;
        Integer page2 = 2;
        Topic mathematics = new Topic("Mathematics");
        Topic physics = new Topic("physics");
        Topic biology = new Topic("biology");
        List<Topic> topics1 = new ArrayList<>();
        List<Topic> topics2 = new ArrayList<>();
        topics1.add(mathematics);
        topics2.add(physics);
        topics2.add(biology);
        index.put(page1, topics1);
        index.put(page2, topics2);
        System.out.println("index: " + index);
        System.out.println("the index keys:" + index.keySet());
        System.out.println("the index values:" + index.values());
        System.out.println("index entry set: " + index.entrySet());
        Topic computerScience = new Topic("Computer Science");
        List<Topic> stored = index.get(page1);
        stored.add(computerScience);
        System.out.println("index: " + index);

        if (index.containsKey(page1)) {
            System.out.println("the index contains page " + page1);
        }
        List<Topic> stored2 = index.get(page2);
        System.out.println("The Topic stored in page number" + page2 + " are: " + stored2);
        System.out.println("size:" + index.size());

    }
}
