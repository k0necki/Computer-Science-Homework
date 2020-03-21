import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("1 - рассчитать сложное выражение [a + b, a - b, a * b, a / b, a ^ b]");
            System.out.println("2 - рассчитать простое выражение [a !, a sqr]");
            System.out.println("3 - выйти из программы");
            System.out.println("Данные вводятся через пробел!");


            Scanner s = new Scanner(System.in);
            int option = s.nextInt();

            if (option == 1) {
                System.out.println("Введите сложное выражение ");
                BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

                String diff_expr = b.readLine();
                double answer = calculator.parse_diff(diff_expr);
                System.out.println(answer);
            } else if (option == 2) {
                System.out.println("Введите простое выражение ");
                BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

                String simple_expr = b.readLine();
                double answer = calculator.parse_simple(simple_expr);
                System.out.println(answer);
            }
            else if (option == 3) {
                break;
            }
        }
//        int f = calculator.factorial(5);
//        System.out.println(f);
    }
}
