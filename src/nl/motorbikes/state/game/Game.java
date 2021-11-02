package nl.motorbikes.state.game;

public class Game {

    private State state;

    private nl.designpatterns.state.game.StartState startState;
    private nl.designpatterns.state.game.PauseState pauseState;
    private nl.designpatterns.state.game.StopState stopState;

    public Game() {
        this.startState = new nl.designpatterns.state.game.StartState(this);
        this.pauseState = new nl.designpatterns.state.game.PauseState(this);
        this.stopState = new nl.designpatterns.state.game.StopState(this);

        this.state = this.getStopState();

    }

    public void start() {
        this.getState().start();
    }

    public void pause() {
        this.getState().pause();
    }

    public void stop() {
        this.getState().stop();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public nl.designpatterns.state.game.StartState getStartState() {
        return startState;
    }

    public void setStartState(nl.designpatterns.state.game.StartState startState) {
        this.startState = startState;
    }

    public nl.designpatterns.state.game.PauseState getPauseState() {
        return pauseState;
    }

    public void setPauseState(nl.designpatterns.state.game.PauseState pauseState) {
        this.pauseState = pauseState;
    }

    public nl.designpatterns.state.game.StopState getStopState() {
        return stopState;
    }

    public void setStopState(nl.designpatterns.state.game.StopState stopState) {
        this.stopState = stopState;
    }
}
