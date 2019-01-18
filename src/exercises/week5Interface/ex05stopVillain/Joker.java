package exercises.week5Interface.ex05stopVillain;

public class Joker implements Villain {
    private Integer live = 10;

    @Override
    public void weaken(String name) {
        System.out.println("Damn you " + name + "! You managed to weaken me!");
        live--;
        if (live == 0) {
            System.out.println("You all defeated me! But I will be back!");
        }
    }
}
