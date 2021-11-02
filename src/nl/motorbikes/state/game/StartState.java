package nl.designpatterns.state.game;

public class StartState implements State {

    private Game game;

    public StartState(Game game) {
        this.game = game;
    }

    @Override
    public void start() {

        System.out.println("Game already started ... keep on playing!");

    }

    @Override
    public void pause() {

        System.out.println("Game paused ... click play to resume");
        game.setState(game.getPauseState());

    }

    @Override
    public void stop() {

        System.out.println("Game stopped! Thank you for playing");
        game.setState(game.getStopState());

    }
}
