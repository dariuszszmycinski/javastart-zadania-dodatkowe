import java.util.Scanner;

class LetterChanger {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfWords = getNumberOfWords();
        String[] words = readWords(numberOfWords);
        String change = readChangeString();
        if (change.equals("upper")) {
            words = changeWordsToUpperCase(words);
        } else if (change.equals("lower")) {
           words =  changeWordsToLowerCase(words);
        } else {
            System.out.println("Nieprawidłowy tekst, zostawiam oryginalny tekst.");
        }
        printArray(words);
    }

    private static String readChangeString() {
        System.out.println("Chcesz zmienić na małe (lower) czy wielkie (upper) litery?");
        return scanner.nextLine();
    }

    private static void printArray(String[] array) {
        for (String word : array) {
            System.out.println(word);
        }
    }

    private static String[] changeWordsToLowerCase(String[] words) {
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            result[i] = words[i].toLowerCase();
        }
        return result;
    }

    private static String[] changeWordsToUpperCase(String[] words) {
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            result[i] = words[i].toUpperCase();
        }
        return result;
    }

    private static String[] readWords(int size) {
        String[] result = new String[size];
        for (int i = 0; i < result.length; i++) {
            System.out.println("Podaj wyraz numer " + (i + 1));
            result[i] = scanner.nextLine();
        }
        return result;
    }

    private static int getNumberOfWords() {
        System.out.println("Ile wyrazów chcesz przeczytać?");
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }


}
