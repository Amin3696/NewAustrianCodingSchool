package exercises.week5Interface.ex06IkeaWardrobe;

public class AddTop implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("Top");

    }
}
