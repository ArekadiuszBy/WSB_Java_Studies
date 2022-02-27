public class Animal {
    private static final Double DEFAULT_KOT_WEIGHT = 1.0;
    private static final Double DEFAULT_PIES_WEIGHT = 2.0;
    String species;
    String name;
    Integer age;
    private Double weight;
    private Boolean alive;

    Animal(String species, String name) {
        this.alive = true;
        this.species = species;
        this.name = name;
        if (species == "Kot") {
            this.weight = DEFAULT_KOT_WEIGHT;
        } else if (species.equals(("Pies"))) {
            this.weight = DEFAULT_PIES_WEIGHT;
        }
    }

    public Double getWeight(){
        return this.weight;
    }

    public void feed(){
        this.weight += 1;
        System.out.println("Dzięki za jedzenie");
    }
}
