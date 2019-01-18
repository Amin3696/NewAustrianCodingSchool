package exercises.week5Interface.ex06IkeaWardrobe;

public class AddBottom implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("Bottom");
    }
}
