import java.util.ArrayList;

class GameMachine {
    //przechowuje kilka gier i pozwala je kupić. W sytuacji, gdy użytkownik próbuje zakupić grę, której nie ma w automacie lub wpłacił zbyt mało pieniędzy
    // rzuć w metodzie obsługującej zakup odpowiednie wyjątki zdefiniowane przez siebie,
    private static ArrayList<Game> games = new ArrayList<>();
    private static int credit;

    public static ArrayList<Game> getGames() {
        return games;
    }

    public static void setGames() {
        games.add(new Game("Wiedźmin 3", 149));
        games.add(new Game("FarCry 4", 109));
        games.add(new Game("DOTA", 0));
        games.add(new Game("Fallout 4", 89));
        games.add(new Game("Skyrim", 59));
        games.add(new Game("FIFA 2020", 239));
        games.add(new Game("Heroes 3", 29));
        games.add(new Game("Quake 3", 19));
        games.add(new Game("Diablo 2", 49));
        games.add(new Game("Diablo 3", 89));
    }

    public static int getCredit() {
        return credit;
    }

    public static void setCredit(int credit) {
            GameMachine.credit = credit;
    }

    public static void buyGame(String title) {
        Game found = findGame(title);
        if (found==null){
            throw new NoGameException("Nie znaleziono gry " + title);
        }else {
            if (found.getPrice()<=credit){
                GameMachineController.succesPurchase(found);
            }else {
                throw new NotEnoughMoneyException("Za mało środków do kupna gry. Wpłacono " + credit + " potrzeba " + found.getPrice());
            }
        }
    }

    private static Game findGame(String title){
        for (Game g:games) {
            if (g.getTitle().equals(title)){
                return g;
            }
        }
        return null;
    }
}
