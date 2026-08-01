public class CreditCardPayment implements PaymentStrategy{

    private int cardNumber;
    public CreditCardPayment(int cardNumber)
    {
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid $"+amount+" with credit card");
    }
}
