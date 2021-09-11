package com.training.abstractfactory.factories;

import com.training.abstractfactory.buttons.Button;
import com.training.abstractfactory.buttons.WindowsButton;
import com.training.abstractfactory.checkboxes.Checkbox;
import com.training.abstractfactory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
