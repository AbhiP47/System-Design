package Factory;

import MAC.MacButton;
import MAC.MacCheckbox;
import Product.Button;
import Product.Checkbox;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
