package exercises.week4DateStructure.ex03Map;

import java.util.HashMap;

public class BasicIndexApplication {
    public static void main(String[] args) {
        HashMap<Integer, String> index = new HashMap<>();
        System.out.println("index: " + index);
        Integer page1 = 1;
        Integer page2 = 2;
        Integer page3 = 3;
        String connecting = "connecting";
        String positive = "positive things";
        String ecologic = "ecologic economy";
        index.put(page3, ecologic);
        index.put(page2, positive);
        index.put(page1, connecting);
        System.out.println("index: " + index);
        System.out.println("index Keys: " + index.keySet());
        System.out.println("index Value: " + index.values());
        System.out.println("index entry set" + index.entrySet());
        String architecture = "Architecture";
        index.put(page2, architecture);
        System.out.println("index: " + index);
        if (index.containsKey(page1)) {
            System.out.println("The page number " + page1 + " exists as key");
        }
        System.out.println("the Topic in page number " + page2 + " is " + index.get(2));
        System.out.println("index size: " + index.size());
    }
}
