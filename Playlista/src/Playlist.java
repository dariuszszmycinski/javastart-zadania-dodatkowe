public class Playlist {
    public static void main(String[] args) {
        Song s1 = new Song("Lalala", 401);
        Song s2 = new Song("Rampampam", 117);
        Song s3 = new Song("Krasnoludki", 330);

        int duration = playListLength(s1, s2, s3);
        printDuration(duration);

    }

    private static void printDuration(int duration) {
        int s = duration%60;
        int m = (duration%3600-s)/60;
        int h=duration/3600;
        System.out.println("Czas trwania playlisty: "+timeToString(h)+":"+timeToString(m)+":"+timeToString(s));
    }

    private static int playListLength(Song... songs) {
        int durationSum = 0;
        for (Song s : songs) {
            durationSum += s.getDuration();
        }
        return durationSum;
    }

    private static String timeToString(int time){
        if (time<10){
            return new String("0"+time);
        }else {
            return String.valueOf(time);
        }
    }
}
