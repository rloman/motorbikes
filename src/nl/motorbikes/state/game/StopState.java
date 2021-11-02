package nl.motorbikes.state.game;

public class StopState implements State {

    private Game game;

    public StopState(Game game) {
        this.game = game;
    }

    @Override
    public void start() {

        System.out.println("Starting the game ...");
        game.setState(game.getStartState());

    }

    @Override
    public void pause() {

        System.out.println("The games is stopped so you can't pause it ... press play first!");

    }

    @Override
    public void stop() {

        System.out.println("The game is already stopped thank you!");

    }
}
