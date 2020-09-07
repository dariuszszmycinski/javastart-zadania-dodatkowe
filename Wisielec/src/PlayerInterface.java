import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PlayerInterface {

    static Scanner scanner = new Scanner(System.in);

    enum Option {
        GRA, EXIT;
    }

    public static void playGame() throws FileNotFoundException {
        System.out.println("Wybierz opcję: " + Option.GRA + "/" + Option.EXIT);
        Option option = Option.valueOf(scanner.nextLine());
        while (option != Option.EXIT) {
            newGame();
            System.out.println("Wybierz opcję: " + Option.GRA + "/" + Option.EXIT);
            option = Option.valueOf(scanner.nextLine());
        }
    }

    private static void newGame() throws FileNotFoundException {
        final String FILE_NAME = "hasła.txt";
        String password = FileScanner.getPassword(new File(FILE_NAME));
        int length = password.length();
        char[] passwordAsChars = password.toCharArray();
        char[] guessedPassword = new char[length];
        for (int i = 0; i < length; i++) {
            if (passwordAsChars[i] == 32) {
                guessedPassword[i] = 32;
            } else {
                guessedPassword[i] = 42;
            }
        }

        ArrayList<Character> guessedLetters = new ArrayList<>();
        boolean exit = false;
        int mistakes = 0;

        while (!exit) {
            System.out.println(guessedPassword);
            System.out.println("Podaj literę:");
            char letter = scanner.nextLine().charAt(0);
            boolean guessed=false;
            for (int i = 0; i < length; i++) {
                if (passwordAsChars[i] == letter) {
                    guessedPassword[i] = letter;
                    guessed=true;
                    guessedLetters.add(letter);
                }
            }
            if (!guessed&&!guessedLetters.contains(letter)) {
                mistakes++;
                System.out.println("Błędy: " + mistakes);
                guessedLetters.add(letter);
            }
            if (mistakes >= 8) {
                System.out.println("Przegrałeś, hasło brzmiało: " + password);
                exit=true;
            }
            if (Arrays.equals(guessedPassword, passwordAsChars)){
                System.out.println("Zwycięstwo, Brawo!");
                exit=true;
            }
        }

    }

}
