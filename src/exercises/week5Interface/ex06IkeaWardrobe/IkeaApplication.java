package exercises.week5Interface.ex06IkeaWardrobe;

public class IkeaApplication {

    public static void main(String[] args) {

        WardrobeBuilder wardrobeBuilder = new WardrobeBuilder();
        Furniture wardrobe = wardrobeBuilder.build();
        System.out.println(wardrobe);
    }

}
