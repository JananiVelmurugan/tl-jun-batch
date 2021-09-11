package com.training.abstractfactory.app;

import com.training.abstractfactory.buttons.Button;
import com.training.abstractfactory.checkboxes.Checkbox;
import com.training.abstractfactory.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
