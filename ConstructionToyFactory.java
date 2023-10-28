public class ConstructionToyFactory extends ToyFactory {
    @Override
    public Toy createToy() {
        return new ConstructionToy();
    }
}
