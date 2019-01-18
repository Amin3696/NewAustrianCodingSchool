package exercises.week5Interface.ex07RockScissorsPaper;

public class Paper implements Move {
    @Override
    public String getName() {
        return "Paper";
    }

    @Override
    public boolean defeat(Move move) {
        return move.getName().equalsIgnoreCase("Rock");
    }
}
