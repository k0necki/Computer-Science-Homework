/*
По данному числу n определите n-е число Фибоначчи.

Входные данные
    Вводится натуральное число n.

Выходные данные
    Выведите ответ на задачу.
 */

import java.util.Scanner;

public class FibonacciNum1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите номер числа Фибонначи");
        int N = s.nextInt();

        int n = 1;
        int num1 = 1;
        int num2 = 1;
        int temp;

        while (n <= N) {
            if (n == N) {
                System.out.println(num1);
                break;
            }
            temp = num1;
            num1 = num2;
            num2 = num2 + temp;
            n++;
        }
    }
}
