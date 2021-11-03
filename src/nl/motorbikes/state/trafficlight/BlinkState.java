package nl.motorbikes.state.trafficlight;

public class BlinkState implements State {

    private TrafficLight trafficLight;

    public BlinkState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void switchGreen() {
        this.trafficLight.state = this.trafficLight.greenState;
        System.out.println("Light switched to green");
    }

    @Override
    public void switchOrange() {
        this.trafficLight.state = this.trafficLight.orangeState;
        System.out.println("Light swtichted to orange");
    }

    @Override
    public void switchRed() {
        this.trafficLight.state = this.trafficLight.redState;
    }

    @Override
    public void switchBlinking() {
        System.out.println("The trafficlight is already in blinking state");
    }
}
