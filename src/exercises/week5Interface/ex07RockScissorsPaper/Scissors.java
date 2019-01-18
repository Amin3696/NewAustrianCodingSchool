package exercises.week5Interface.ex07RockScissorsPaper;

public class Scissors implements Move {
    @Override
    public String getName() {
        return "Scissors";
    }

    @Override
    public boolean defeat(Move move) {
        return move.getName().equalsIgnoreCase("Paper");
    }
}
