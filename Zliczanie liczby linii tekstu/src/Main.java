import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
    private static int lines = 0;

    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "D:\\JAVA\\projects dasz\\javastart zadania dodatkowe\\Zliczanie liczby linii tekstu\\filelinecounter";
        File file = new File(filePath);
        System.out.println("Total lines: "+getLinesNumberAllFiles(file));
    }

    public static int getLinesNumberAllFiles (File file) throws FileNotFoundException {
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File value : files) {
                getLinesNumberAllFiles(value);
            }
        }else {
            lines = lines + getFileLinesNumber(file);
        }
        return lines;
    }

    public static int getFileLinesNumber (File file) throws FileNotFoundException {
        int lines = 0;
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            lines++;
            sc.nextLine();
        }
        sc.close();
        System.out.println(file.getName()+" --> "+lines);
        return lines;
    }
}
