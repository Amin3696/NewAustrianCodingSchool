package exercises.week5Interface.ex07RockScissorsPaper;

public class Rock implements Move {
    @Override
    public String getName() {
        return "Rock";
    }

    @Override
    public boolean defeat(Move move) {
        return move.getName().equalsIgnoreCase("Scissors");
    }
}
