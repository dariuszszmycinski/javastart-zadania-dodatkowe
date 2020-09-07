import java.util.ArrayList;
import java.util.Scanner;

class Order {
    public static ArrayList<Dish> getOrder(ArrayList<Dish> menu){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zamów wybrane potrawy, wymieniając ich numery po przecinku:");
        String input = sc.nextLine().replaceAll(" ","");
        String[] dishNumbers = input.split(",");
        int[] dishNumbersInt = new int[dishNumbers.length];
        for (int i = 0; i < dishNumbers.length; i++) {
            dishNumbersInt[i] = Integer.parseInt(dishNumbers[i]);
        }
        ArrayList<Dish> order = new ArrayList<>();
        for (int i:dishNumbersInt) {
            order.add(menu.get(i-1));
        }
        return order;
    }

}
