import java.util.ArrayList;

class RestaurantApp {
    public static void main(String[] args) {
        ArrayList<Dish> menu = getMenu();
        menu.forEach(System.out::println);
        ArrayList<Dish> order = Order.getOrder(menu);
        PaymentService.printBill(order);
    }

    private static ArrayList<Dish> getMenu() {
        ArrayList<Dish> menu = new ArrayList<>();
        menu.add(new Dish(1, "Pizza Margherita", 24.99));
        menu.add(new Dish(2, "Pizza Mafioso", 29.99));
        menu.add(new Dish(3, "Spaghetti Bolognese", 31.99));
        menu.add(new Dish(4, "Spaghrtti Carbonara", 26.99));
        menu.add(new Dish(5, "Lassagne", 24.99));
        menu.add(new Dish(6, "Gazpacho", 16.99));
        menu.add(new Dish(7, "Cannelloni ze szpinakiem", 29.99));
        menu.add(new Dish(8, "Bruschetta", 13.99));
        menu.add(new Dish(9, "Tiramisu", 19.99));
        menu.add(new Dish(10, "Panna Cotta", 19.99));
        return menu;
    }
}
