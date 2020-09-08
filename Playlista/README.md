W programie stwórz klasę reprezentującą pojedynczą piosenkę. Każda piosenka powinna mieć informację o nazwie oraz czasie trwania wyrażoną w sekundach.

W osobnej klasie, np. Playlist, zdefiniuj metodę, która przyjmuje dowolną liczbę piosenek (jako osobne argumenty) i zwraca łączny czas odtwarzania w sekundach. Powinno więc być możliwe wywołanie metody w dowolny z przedstawionych poniżej sposobów:

Song song1 = new Song("Ulalala", 320);
int playlistLength = Playlist.playlistLength(song1);1
2
file_copy
lub

Song song1 = new Song("Ulalala", 320);
Song song2 = new Song("Nothing else matters", 320);
int playlistLength = Playlist.playlistLength(song1, song2);1
2
3
file_copy
Stwórz klasę testową, w której wyświetlisz czas odtwarzania w postaci HH:mm:ss gdzie H to godziny, m to minuty, a s to sekundy.
