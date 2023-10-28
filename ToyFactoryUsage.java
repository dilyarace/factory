public class ToyFactoryUsage {
    public static void main(String[] args) {
        ToyFactory softToyFactory = ToyFactoryProducer.getFactory("SoftToy");
        if (softToyFactory != null) {
            Toy softToy = softToyFactory.createToy();
            if (softToy != null) {
                softToy.play();
            } else {
                System.out.println("Failed to create soft toy");
            }
        } else {
            System.out.println("Factory for soft toys is not available");
        }

        ToyFactory constructionToyFactory = ToyFactoryProducer.getFactory("ConstructionToy");
        if (constructionToyFactory != null) {
            Toy constructionToy = constructionToyFactory.createToy();
            if (constructionToy != null) {
                constructionToy.play();
            } else {
                System.out.println("Failed to create construction toy");
            }
        } else {
            System.out.println("Factory for construction toys is not available");
        }
    }
}
