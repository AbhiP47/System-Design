import Factory.GUIFactory;
import Factory.MacFactory;
import Product.Button;
import Product.Checkbox;

public class Main {
    public static void main(String[] args) {

        GUIFactory factory = new MacFactory();
        Button btn = factory.createButton();
        Checkbox chk = factory.createCheckbox();

        btn.paint();
        chk.render();
    }
}
