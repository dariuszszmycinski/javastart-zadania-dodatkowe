class Tree implements Drawable {
    private final int SIZE;

    public Tree(int size) {
        this.SIZE = size;
    }

    @Override
    public void draw() {
        for (int i = 0; i <SIZE ; i++) {
            String sb = " ".repeat(SIZE - i - 1) + "*".repeat(Math.max(0, 2 * i + 1));
            System.out.println(sb);
        }
    }
}
