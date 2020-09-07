class Rectangle implements Drawable {
    private final int SIDE_A;
    private final int SIDE_B;

    public Rectangle(int sideA, int sideB) {
        this.SIDE_A = sideA;
        this.SIDE_B = sideB;
    }

    @Override
    public void draw() {
        for (int i = 0; i <SIDE_B ; i++) {
            System.out.println("* ".repeat(Math.max(0, SIDE_A)));
        }
    }
}
