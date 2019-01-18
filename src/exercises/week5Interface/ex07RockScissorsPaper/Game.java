package exercises.week5Interface.ex07RockScissorsPaper;

public class Game {

    private Player player1 = new Human();
    private Player player2 = new Computer();
    private Judge judge = new Judge();


    public void play() {
        displayWelcomeMessage();
        boolean playersWantsToPlay = true;
        while (playersWantsToPlay) {
            playOneRound();
            playersWantsToPlay = askPlayers();
        }
        displayGoodbyMessage();
    }

    private void displayWelcomeMessage() {
        System.out.println("Let’s play rock, paper, scissors!");

    }

    private void playOneRound() {
        Move move1 = player1.choose();
        Move move2 = player2.choose();
        String result = judge.judge(move1, move2);
        System.out.println(result);

    }

    private boolean askPlayers() {
        return player1.wantsToPlayAgain() && player2.wantsToPlayAgain();
    }

    private void displayGoodbyMessage() {
        System.out.println("See you next time!");
    }
}
