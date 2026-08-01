public class Client {
    public static void main(String[] args) {
        Product product = SimpleToyFactory.createToy("car");
        product.ship();
        SimpleToyFactory.createToy("doll");
    }
}
