import java.util.Scanner;

public class Barman {
    public static void main(String[] args) {
        Drink drink = getIngredients();
        printDrink(drink);

    }

    private static Drink getIngredients() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę składników:");
        int number = sc.nextInt();
        sc.nextLine();
        Ingredient[] ingredients = new Ingredient[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Podaj składnik:");
            String name1 = sc.nextLine();
            System.out.println("Podaj ilość:");
            int quantity1 = sc.nextInt();
            sc.nextLine();
            ingredients[i]= new Ingredient(name1,quantity1);
        }
        return new Drink(ingredients);
    }

    private static void printDrink (Drink drink){
        System.out.println("Drink skłąda się z "+drink.getIngredients().length+" składników.");
        for (Ingredient i :drink.getIngredients()) {
            System.out.println(i);
        }
    }


}
