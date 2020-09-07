public class Drink {
    private final Ingredient ingredient1;
    private final Ingredient ingredient2;
    private final Ingredient ingredient3;

    public Drink(Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3) {
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
    }

    @Override
    public String toString() {
        int totalQuantity = ingredient1.getMililiters()+ingredient2.getMililiters()+ingredient3.getMililiters();
        double proportion1 = (double)ingredient1.getMililiters()/totalQuantity;
        double proportion2 = (double)ingredient2.getMililiters()/totalQuantity;
        double proportion3 = (double)ingredient3.getMililiters()/totalQuantity;
        return "Składniki drinka to: "+ingredient1.getName()+", "+ingredient2.getName()+", "+ingredient3.getName()
                +" w proporcjach: "+proportion1+" "+proportion2+" "+proportion3
                +". \nJego pojemność to "+totalQuantity+" ml." ;
    }
}
