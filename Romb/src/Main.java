import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = getNumberFromUser();
        printDiamond(number);
    }

    private static void printDiamond(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = number; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static int getNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą większą od zera:");
        int number = 0;
        try {
            number = sc.nextInt();
            while (number < 1) {
                System.err.println("Podaj liczbę większą od 0!");
                number = sc.nextInt();
            }
        } catch (InputMismatchException e) {
            System.err.println("Nie podano liczby całkowitej!");
            ;
        }
        return number;
    }
}
