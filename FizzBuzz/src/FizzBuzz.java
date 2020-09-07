import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzzLoop(1,100);
        fizzBuzzStream(1,100);
    }

    private static void fizzBuzzLoop (int start, int end){
        System.out.println("Rozwiązanie z pętlą:");
        for (int i = start; i <=end ; i++) {
            printFizzBuzz(i);
        }
    }

    private static void printFizzBuzz(int number) {
            if (number%15==0){
                System.out.println(number+" FizzBuzz");
            }else if(number%3==0){
                System.out.println(number+" Fizz");
            }else if (number%5==0){
                System.out.println(number+" Buzz");
            }
    }

    private static void fizzBuzzStream (int start, int end){
        System.out.println("Rozwiązanie ze strumieniem:");
        IntStream.rangeClosed(start,end)
                .forEach(FizzBuzz::printFizzBuzz);
    }
}
