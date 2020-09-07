class Product {
    private final String NAME;
    private final int QUANTITY;

    public Product(String name, int quantity) {
        this.NAME = name;
        this.QUANTITY = quantity;
    }

    public String getName() {
        return NAME;
    }

    @Override
    public String toString() {
        double maxQuantity = 100;
        int numberOfStars = (int)Math.round(QUANTITY*10/maxQuantity);
        return NAME + " (" + QUANTITY + ") "+ "*".repeat(Math.max(0, numberOfStars));
    }
}
