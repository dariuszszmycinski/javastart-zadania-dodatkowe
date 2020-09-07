import java.util.Arrays;

public class Drink {
    private Ingredient[] ingredients;

    public Drink(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return Arrays.toString(ingredients);
    }
}
