package nl.motorbikes.state.game;

public class Application {

    public static void main(String[] args) {
        nl.motorbikes.state.game.Game game = new nl.motorbikes.state.game.Game();

        game.stop();

        game.pause();

        game.start();

        game.pause();

//        game.start();

        game.stop();

    }
}
