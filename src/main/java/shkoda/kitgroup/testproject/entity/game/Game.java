package shkoda.kitgroup.testproject.entity.game;


import shkoda.kitgroup.testproject.entity.actors.Player;

public final class Game {

    private Player attacker;
    private Player defender;

    private int turns;

    private GameState state = GameState.START_ANIMATION;

    private boolean isFinished;

    public Game(Player attacker, Player defender) {
        this.attacker = attacker;
        this.defender = defender;
    }

    public void start() {

    }


    private void startTurn(long timestamp, boolean timerInterrupted) {

    }

    public void endMove() {

    }

    public enum GameState {
        START_ANIMATION,
        MOVE,
        MOVE_END,
        AFTER_MOVE_ANIMATION
    }
}
