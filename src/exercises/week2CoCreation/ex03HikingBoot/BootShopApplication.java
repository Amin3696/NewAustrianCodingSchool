package exercises.week2CoCreation.ex03HikingBoot;

import java.util.List;

public class BootShopApplication {
    public static void main(String[] args) {
        BootShopAssistant assistant = new BootShopAssistant();
        List<HikingBoot> boots = assistant.getHikingBootRecommendations();
        Hansel hansel = new Hansel();
        hansel.tryHikingBoots(boots);
    }
}
