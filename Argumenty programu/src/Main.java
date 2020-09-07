import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int length = getLength(args);
        int[] numbers = getIntsArray(args, length);
        System.out.println("Argumenty: " + Arrays.toString(numbers));
        printPower(length, numbers);
        printSum(length, numbers);
    }

    private static void printSum(int length, int[] numbers) {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += numbers[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Suma: ");
        for (int i = 0; i < length; i++) {
            sb.append(numbers[i]);
            if (length - i != 1) {
                sb.append(" + ");
            }
        }
        sb.append(" = " + sum);
        System.out.println(sb.toString());
    }

    private static void printPower(int length, int[] numbers) {
        int[] numbersPow = new int[length];
        for (int i = 0; i < length; i++) {
            numbersPow[i] = numbers[i] * numbers[i];
        }
        System.out.println("Kwadraty argumentów: " + Arrays.toString(numbersPow));
    }

    private static int[] getIntsArray(String[] args, int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        return numbers;
    }

    private static int getLength(String[] args) {
        int length = args.length;
        System.out.println("Ilość argumentów: " + length);
        return length;
    }
}
