/*
Дано целое число, не меньшее 2. Выведите его наименьший натуральный делитель, отличный от 1.

Входные данные
    Вводится натуральное число.

Выходные данные
    Выведите ответ на задачу.
 */

import java.util.Scanner;

public class MInDiv_While {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число N ");
        int n = s.nextInt();
        int min_div = 0;
        int i = 1;

        while (i <= n) {
            i ++;
            if (n % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
