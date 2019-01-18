package exercises.week5Interface.ex06IkeaWardrobe;

public class AddBack implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("Back");
    }
}
