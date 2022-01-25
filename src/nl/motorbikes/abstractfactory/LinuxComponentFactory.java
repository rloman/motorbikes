package nl.motorbikes.abstractfactory;

import nl.motorbikes.abstractfactory.general.Button;
import nl.motorbikes.abstractfactory.general.Frame;
import nl.motorbikes.abstractfactory.general.Window;
import nl.motorbikes.abstractfactory.linux.LinuxButton;
import nl.motorbikes.abstractfactory.linux.LinuxFrame;
import nl.motorbikes.abstractfactory.linux.LinuxWindow;

public class LinuxComponentFactory implements ComponentFactory {

    @Override
    public Frame getFrame() {
        return new LinuxFrame();
    }

    @Override
    public Window getWindow() {
        return new LinuxWindow();
    }

    @Override
    public Button getButton() {
        return new LinuxButton();
    }
}
