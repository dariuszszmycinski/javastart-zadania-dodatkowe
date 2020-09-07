import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class FileScanner {
    static final String FILE_NAME = "Lottery_Mega_Millions_Winning_Numbers__Beginning_2002.csv";
    static File file = new File(FILE_NAME);
    static Scanner scanner;

    static {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static ArrayList<Draw> getDrawsFromFile() {
        ArrayList<Draw> draws = new ArrayList<>();
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(",");
            int megaBall = Integer.parseInt(line[2]);
            String[] numbersString = line[1].split(" ");
            int[] numbersInt = new int[numbersString.length];
            for (int i = 0; i < numbersInt.length; i++) {
                numbersInt[i] = Integer.parseInt(numbersString[i]);
                draws.add(new Draw(numbersInt, megaBall));
            }
        }
        return draws;
    }
}