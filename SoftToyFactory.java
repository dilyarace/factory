public class SoftToyFactory extends ToyFactory {
    @Override
    public Toy createToy() {
        return new SoftToy();
    }
}
