/*
По данному натуральному числу N выведите такое наименьшее целое число k, что 2^k >= N.

Входные данные
    Вводится натуральное число N.

Выходные данные
    Выведите ответ на задачу.
 */

import java.util.Scanner;

public class BinaryLogarithm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число N ");
        int n = s.nextInt();
        int i = 1;
        int k = 0;

        while (i <= n) {
            i *= 2;
            k += 1;
        }
        System.out.println(k);
    }
}
