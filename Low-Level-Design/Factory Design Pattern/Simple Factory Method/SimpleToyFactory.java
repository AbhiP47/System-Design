public class SimpleToyFactory {

    public static Product createToy(String type)
    {
        if(type.equalsIgnoreCase("car"))
            return new ToyCar();
        if(type.equalsIgnoreCase("doll"))
            return new ToyDoll();
        throw new IllegalArgumentException("Unkown Toy");
    }
}
