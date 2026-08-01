package Factory;

import Product.Button;
import Product.Checkbox;
import Windows.WinButton;
import Windows.WinCheckbox;

public class WinFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
