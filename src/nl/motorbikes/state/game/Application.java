package nl.motorbikes.state.game;

public class Application {

    public static void main(String[] args) {
        nl.designpatterns.state.game.Game game = new nl.designpatterns.state.game.Game();

        game.stop();

        game.pause();

        game.start();

        game.pause();

//        game.start();

        game.stop();

    }
}
