public class Client {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addAmount(500);
        shoppingCart.addAmount(125);

//        shoppingCart.checkout(new CreditCardPayment(987654321));

        shoppingCart.checkout(new PaypalPayment("abhinav@gmail.com"));

    }
}
