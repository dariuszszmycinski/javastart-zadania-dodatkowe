class Player implements Comparable<Player>{
    private String nickname ;
    private int score;

    public Player(String nickname, int score) {
        this.nickname = nickname;
        this.score = score;
    }

    public String getNickname() {
        return nickname;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Player p) {
        return Integer.compare(p.score, this.score);
    }

    @Override
    public String toString() {
        return nickname + ' ' + score;
    }
}
