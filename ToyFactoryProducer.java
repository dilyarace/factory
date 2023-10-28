public class ToyFactoryProducer {
    public static ToyFactory getFactory(String type) {
        if (type.equalsIgnoreCase("SoftToy")) {
            return new SoftToyFactory();
        } else if (type.equalsIgnoreCase("ConstructionToy")) {
            return new ConstructionToyFactory();
        }
        return null;
    }
}
