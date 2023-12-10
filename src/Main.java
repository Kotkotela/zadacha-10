import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        System.out.print("введите первое число: ");
        a = in.nextInt();
        System.out.print("введите второе число: ");
        b = in.nextInt();
        long sum = calculateSumBetween(a, b);
        System.out.println("Сумма чисел между " + a + " и " + b + ": " + sum);
    }

    public static long calculateSumBetween(int a, int b) {
        return LongStream.range(a, b)
                .sum();
    }
}
