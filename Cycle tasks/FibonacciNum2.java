/*
Дано натуральное число A > 1. Определите, каким по счету числом Фибоначчи оно является,
то есть выведите такое число n, что φn=A. Если А не является числом Фибоначчи, выведите число -1.

Входные данные
    Вводится натуральное число.

Выходные данные
    Выведите ответ на задачу.
 */

import java.util.Scanner;

public class FibonacciNum2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите значение числа Фибоначчи ");
        int A = s.nextInt();

        int num1 = 1;
        int num2 = 1;
        int temp;
        int i = 2;

        while (i < A) {
            i++;
            temp = num1;
            num1 = num2;
            num2 = num1 + temp;
            if (num2 == A) {
                System.out.println(i);
                break;
            }
        }
        if (num2 != A) {
            System.out.println(-1);
        }
    }
}
