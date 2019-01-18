package exercises.week5Interface.ex07RockScissorsPaper;

public class Judge {

    public String judge(Move move1, Move move2) {
        display(move1, move2);
        return findWinner(move1, move2);
    }

    private void display(Move move1, Move move2) {
        System.out.println("Player1 chose: " + move1.getName());
        System.out.println("Player2 chose: " + move2.getName());

    }

    private String findWinner(Move move1, Move move2) {
        if (move1.defeat(move2)) {
            return "You win!";
        }
        if (move2.defeat(move1)) {
            return "The computer wins!";
        }
        return "Nobody wins!";
    }

}
