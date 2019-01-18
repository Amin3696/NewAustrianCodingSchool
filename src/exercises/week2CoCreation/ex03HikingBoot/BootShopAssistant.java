package exercises.week2CoCreation.ex03HikingBoot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BootShopAssistant {
    public List<HikingBoot> getHikingBootRecommendations() {
        ArrayList<HikingBoot> boots = new ArrayList<>();
        boots.add(new HikingBoot(40));
        boots.add(new HikingBoot(41));
        boots.add(new HikingBoot(42));
        Collections.shuffle(boots);
        return boots;
    }
}
