public class ShoppingCart {
    private int amount = 0;

    public  void addAmount(int price)
    {
        this.amount += price;
    }

    public void checkout(PaymentStrategy paymentStrategy)
    {
        paymentStrategy.pay(amount);
    }
}
