import java.util.Comparator;

class NicknameComparatorReversed implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        return p2.getNickname().compareTo(p1.getNickname());
    }
}