package nl.designpatterns.state.game;

public class PauseState implements State {

    private Game game;

    public PauseState(Game game) {
        this.game = game;
    }

    @Override
    public void start() {

        System.out.println("Resume playing");
        game.setState(game.getStartState());

    }

    @Override
    public void pause() {
        System.out.println("The game is ALREADY paused. Press the play button to resume");

    }

    @Override
    public void stop() {
        System.out.println("Game stopped while pausing ... to save energy please stop me directly next time, dumbo!");
        game.setState(game.getStopState());
    }
}
