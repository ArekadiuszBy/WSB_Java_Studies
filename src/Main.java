public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Kot", "Andrzejos");
        System.out.println(animal.getWeight() + "\n");
        animal.feed();
        animal.feed();

        System.out.println("\n" + animal.getWeight());
    }
}
