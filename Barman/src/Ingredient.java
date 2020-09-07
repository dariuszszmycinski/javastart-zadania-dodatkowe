public class Ingredient {
    private final String name;
    private final int mililiters;

    public Ingredient(String name, int mililiters) {
        this.name = name;
        this.mililiters = mililiters;
    }

    public String getName() {
        return name;
    }

    public int getMililiters() {
        return mililiters;
    }
}
