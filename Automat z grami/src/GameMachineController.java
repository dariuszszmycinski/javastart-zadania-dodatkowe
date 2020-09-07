import java.util.InputMismatchException;
import java.util.Scanner;

class GameMachineController {
    private static Scanner scanner = new Scanner(System.in);

    public static String getGameTitleFromUser(){
        System.out.println("Podaj tytuł gry:");
        return scanner.nextLine();
    }

    public static int getCreditFromUser(){
        int credit = 0;
        while (credit == 0){
            System.out.println("Podaj kwotę:");
            try{
                credit  = scanner.nextInt();
                scanner.nextLine();
            }catch (InputMismatchException e){
                System.err.println("Podano błędną kwotę.");
                scanner.nextLine();
            }
        }
        return credit;
    }

    public static void succesPurchase(Game game){
        System.out.println("Transakcja zakończona sukcesem.");
        System.out.println("Odbierz grę "+game.getTitle());
        System.out.println("Odbierz resztę "+(GameMachine.getCredit()-game.getPrice()));
    }

}
