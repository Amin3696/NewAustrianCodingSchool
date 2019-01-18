package exercises.week5Interface.ex06IkeaWardrobe;

public class AddDoor implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("Door");

    }
}
