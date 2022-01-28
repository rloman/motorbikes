package nl.motorbikes.abstractfactory;

import nl.motorbikes.abstractfactory.general.*;

public class UI {

    private ComponentFactory componentFactory;

    private Frame frame;
    private Window window;
    private Button button;

    public UI(ComponentFactory componentFactory) {
        this.componentFactory = componentFactory;

        this.frame = componentFactory.getFrame();
        this.window = componentFactory.getWindow();
        this.button = componentFactory.getButton();
    }

    public void draw() {
        System.out.println("Clicking with a "+button.getClass().getSimpleName()
                +" button on a "+this.frame.getClass().getSimpleName()+" frame in a "+this.window.getClass().getSimpleName()+" window");
    }
}
