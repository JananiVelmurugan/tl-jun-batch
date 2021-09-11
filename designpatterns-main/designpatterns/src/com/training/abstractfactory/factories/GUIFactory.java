package com.training.abstractfactory.factories;

import com.training.abstractfactory.buttons.Button;
import com.training.abstractfactory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
