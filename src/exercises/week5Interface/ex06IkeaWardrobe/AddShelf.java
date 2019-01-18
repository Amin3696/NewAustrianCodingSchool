package exercises.week5Interface.ex06IkeaWardrobe;

public class AddShelf implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("shelf");
    }
}
