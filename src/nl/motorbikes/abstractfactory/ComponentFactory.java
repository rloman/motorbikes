package nl.motorbikes.abstractfactory;

import nl.motorbikes.abstractfactory.general.Button;
import nl.motorbikes.abstractfactory.general.Frame;
import nl.motorbikes.abstractfactory.general.Window;

public interface ComponentFactory {

    Frame getFrame();
    Window getWindow();
    Button getButton();
}
