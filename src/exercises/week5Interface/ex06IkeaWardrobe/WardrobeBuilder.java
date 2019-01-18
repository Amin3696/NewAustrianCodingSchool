package exercises.week5Interface.ex06IkeaWardrobe;

import java.util.Arrays;
import java.util.List;

public class WardrobeBuilder {

    private List<Step> steps = getSteps();

    public Furniture build() {
        Wardrobe wardrobe = new Wardrobe();
        for (Step step : steps) {
            step.perform(wardrobe);
        }
        return wardrobe;
    }

    private List<Step> getSteps() {
        AddBottom bottom = new AddBottom();
        AddSide side = new AddSide();
        AddBack back = new AddBack();
        AddTop top = new AddTop();
        AddShelf shelf = new AddShelf();
        AddDoor door = new AddDoor();
        return Arrays.asList(bottom, side, side, back, top, shelf, shelf,
                shelf, shelf, shelf, shelf, shelf, shelf, door, door);
    }
}
