package Factory;

import Product.Button;
import Product.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
