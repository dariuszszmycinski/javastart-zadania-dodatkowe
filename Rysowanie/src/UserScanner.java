import java.util.Scanner;

class UserScanner {
    static Scanner scanner = new Scanner(System.in);

    public static Drawable getShapeFromUser() {
        System.out.println("Wybierz figurę [T]ree/[S]quare/[R]ectangle");
        String option = scanner.nextLine();
        switch (option) {
            case "T":
                System.out.println("Podaj wysokość:");
                int high = scanner.nextInt();
                return new Tree(high);
            case "R":
                System.out.println("Podaj bok A:");
                int sideA = scanner.nextInt();
                System.out.println("Podaj bok B:");
                scanner.nextLine();
                int sideB = scanner.nextInt();
                return new Rectangle(sideA, sideB);
            case "S":
                System.out.println("Podaj bok:");
                int side = scanner.nextInt();
                return new Square(side);
            default:
                System.err.println("Błędny wybór");
                return null;
        }

    }
}
