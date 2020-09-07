import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


class FileScanner {

    public static String getPassword (File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        ArrayList<String> passwords = new ArrayList<>();
        while (sc.hasNextLine()){
            passwords.add(sc.nextLine());
        }
        sc.close();
        Random random = new Random();
        return passwords.get(random.nextInt(passwords.size()));
    }
}
