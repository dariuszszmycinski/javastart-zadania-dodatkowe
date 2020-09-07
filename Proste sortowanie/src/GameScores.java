import java.util.ArrayList;
import java.util.Comparator;

class GameScores {

    public static void main(String[] args) {
        ArrayList<Player> scores = new ArrayList<>();
        scores.add(new Player("Daro",111));
        scores.add(new Player("Yurga",69));
        scores.add(new Player("Ania",666));
        scores.add(new Player("Zygi", 345));
        scores.add(new Player("Ala",12));
        scores.add(new Player("Noob",999));
        System.out.println(scores);
        scores.sort(Player::compareTo);
        System.out.println(scores);
        scores.sort(new NicknameComparatorNormal());
        System.out.println(scores);
        scores.sort(new NicknameComparatorReversed());
        System.out.println(scores);
        scores.sort(new ScoreComparatorReversed());
        System.out.println(scores);
        scores.sort(Comparator.comparingInt(Player::getScore));
        System.out.println(scores);
        scores.sort(Comparator.comparing(Player::getNickname).reversed());
        System.out.println(scores);
    }
}
