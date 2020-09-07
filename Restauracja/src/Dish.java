class Dish {
    private final int NUMBER;
    private final String NAME;
    private final double PRICE;


    Dish(int number, String name, double price) {
        NUMBER = number;
        NAME = name;
        PRICE = price;
    }

    public double getPRICE() {
        return PRICE;
    }

    @Override
    public String toString() {
        return NUMBER +", " + NAME + ", " + PRICE +"zł.";
    }
}
