package com.training.abstractfactory.factories;

import com.training.abstractfactory.buttons.Button;
import com.training.abstractfactory.buttons.MacOSButton;
import com.training.abstractfactory.checkboxes.Checkbox;
import com.training.abstractfactory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
