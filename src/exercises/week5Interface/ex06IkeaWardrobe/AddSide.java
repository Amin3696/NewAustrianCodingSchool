package exercises.week5Interface.ex06IkeaWardrobe;

public class AddSide implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("Side");
    }
}
