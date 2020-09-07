class Square implements Drawable {
    private final int SIDE;

    public Square(int side) {
        this.SIDE = side;
    }

    @Override
    public void draw() {
        for (int i = 0; i <SIDE ; i++) {
            System.out.println("* ".repeat(SIDE));
        }
    }
}
