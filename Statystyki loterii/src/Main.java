import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Draw> draws = FileScanner.getDrawsFromFile();
        int[][] numbersResult = LotteryStatistics.findNumbersResult(draws);
        System.out.println("Najpopularniejsze liczby:");
        LotteryStatistics.printTopNumbers(numbersResult, 10);
        int[][] megaBallResult = LotteryStatistics.findMegaBallResult(draws);
        System.out.println("Najpopularniejsze liczby Mega Ball:");
        LotteryStatistics.printTopNumbers(megaBallResult, 3);
    }
}
