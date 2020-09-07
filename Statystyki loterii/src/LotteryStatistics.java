import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class LotteryStatistics {

    static int[][] findNumbersResult(ArrayList<Draw> draws) {
        int[][] numbersResult = new int[75][2];
        for (int i = 0; i < 75; i++) {
            numbersResult[i][0] = i + 1;
            numbersResult[i][1] = 0;
        }
        for (Draw d : draws) {
            for (int i : d.getNumbers()) {
                numbersResult[i - 1][1]++;
            }
        }
        sortArray(numbersResult);
        return numbersResult;
    }

    static int[][] findMegaBallResult(ArrayList<Draw> draws) {
        int[][] megaBallResult = new int[52][2];
        for (int i = 0; i < 52; i++) {
            megaBallResult[i][0] = i + 1;
            megaBallResult[i][1] = 0;
        }
        for (Draw d : draws) {
            megaBallResult[d.getMegaBall() - 1][1]++;
        }
        sortArray(megaBallResult);
        return megaBallResult;
    }

    static void printTopNumbers(int[][] numbers, int top) {
        for (int i = 0; i < top; i++) {
            System.out.println("Miejsce #" + (i + 1) + " numer " + numbers[i][0] + " ilość " + numbers[i][1]);
        }
    }

    private static void sortArray(int[][] numbersResult) {
        Arrays.sort(numbersResult, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
    }
}
