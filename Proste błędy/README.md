Poniższy program ma za zadanie wczytać od użytkownika dowolną ilość liczb nieujemnych, a następnie je zsumować.

Sumowanie następuje po podaniu pierwszej liczby ujemnej.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberAdder {
    public static void main(String[] args) {
        List<Double> numbers = readNumbersFromUser();
        printSum(numbers);
    }

    private static List<Double> readNumbersFromUser() {
        List<Double> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        double number = 0;
        do {
            System.out.println("Podaj liczbę (liczba ujemna kończy wprowadzanie):");
            number = input.nextDouble();
            if(number >= 0) {
                numbers.add(number);
            }
        } while(number >= 0);
        return numbers;
    }

    private static void printSum(List<Double> numbers) {
        StringBuilder builder = new StringBuilder();
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            builder.append(numbers.get(i));
            sum += numbers.get(i);
            if(i < (numbers.size()-1))
                builder.append(" + ");
        }
        builder.append(" = ");
        builder.append(sum);
        System.out.println(builder.toString());
    }
}
file_copy
Przykładowy wynik działania programu:

Podaj liczbę (liczba ujemna kończy wprowadzanie):
5
Podaj liczbę (liczba ujemna kończy wprowadzanie):
10
Podaj liczbę (liczba ujemna kończy wprowadzanie):
12
Podaj liczbę (liczba ujemna kończy wprowadzanie):
-5
5.0 + 10.0 + 12.0 = 27.01

file_copy
Choć aplikacja jest bardzo prosta, to jednak może sprawiać problemy, gdy użytkownik zamiast liczby poda jakiś napis, np.:

Podaj liczbę (liczba ujemna kończy wprowadzanie):
5
Podaj liczbę (liczba ujemna kończy wprowadzanie):
abc
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
	at pl.javastart.zadania.exceptions.basics.NumberAdder.readNumbersFromUser(NumberAdder.java:19)
	at pl.javastart.zadania.exceptions.basics.NumberAdder.main(NumberAdder.java:9)
file_copy
Dodaj do programu obsługę wyjątków. Jeśli użytkownik wprowadzi wartość niebędącą liczbą, to powinien zobaczyć odpowiedni komunikat z ostrzeżeniem i program powinien poprosić o podanie liczby jeszcze raz.
