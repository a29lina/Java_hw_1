import java.util.Scanner;

public class first {
    public static void main(String[] args) {

        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n).

        System.out.println("Введите число: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int n = iScanner.nextInt();
            int f = factorial(n);
            int tr = triang(n);
            System.out.println("Cумма чисел от 1 до n = " + tr);
            System.out.println("Произведение чисел от 1 до n = " + f);
        }

    }

    static int triang(int x) {
        return (x * (x + 1)) / 2;
    }

    static int factorial(int x) {
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }
}
