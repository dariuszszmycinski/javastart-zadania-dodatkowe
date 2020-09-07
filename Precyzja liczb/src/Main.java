import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = getNumberFromUser();
        printNumbers(number);
    }

    private static void printNumbers(int number) {
        if (number > 0) {
            for (double i = 0; i < number + 0.1; i += 0.1) {
                System.out.printf("%.2f ", i);
            }
        } else {
            for (double i = 0; i > number - 0.1; i -= 0.1) {
                System.out.printf("%.2f ", i);
            }
        }
    }

    private static int getNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę inną od 0");
        int number = sc.nextInt();
        while (number == 0) {
            System.err.println("Podano zero! Podaj inną liczbę.");
            number = sc.nextInt();
        }
        sc.close();
        return number;
    }
}
