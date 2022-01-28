package nl.motorbikes.abstractfactory;

import nl.motorbikes.abstractfactory.general.Button;
import nl.motorbikes.abstractfactory.general.Frame;
import nl.motorbikes.abstractfactory.general.Window;

public class WindowsComponentFactory implements  ComponentFactory {
    @Override
    public Frame getFrame() {
        return null;
    }

    @Override
    public Window getWindow() {
        return null;
    }

    @Override
    public Button getButton() {
        return null;
    }
}
