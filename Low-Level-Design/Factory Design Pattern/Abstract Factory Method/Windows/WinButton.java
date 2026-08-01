package Windows;

import Product.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
