public class Barman {
    public static void main(String[] args) {
        Drink drink = createDrink("Sok ananasowy",100,"Likier malibu",50,"Mleko kokosowe",100);
        System.out.println(drink);

    }

    public static Drink createDrink (String name1, int quantity1, String name2, int quantity2, String name3, int quantity3){
        return new Drink(new Ingredient(name1,quantity1), new Ingredient(name2,quantity2), new Ingredient(name3,quantity3));
    }
}
