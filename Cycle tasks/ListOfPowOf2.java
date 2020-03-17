/*
По данному числу N распечатайте все целые степени двойки, не превосходящие N, в порядке возрастания.

Входные данные
    Вводится натуральное число.

Выходные данные
    Выведите ответ на задачу.
 */

import java.util.Scanner;

public class ListOfPowOf2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число N ");
        int n = s.nextInt();
        int i = 1;

        while (i < n) {
            if (i < n) {
                System.out.println(i);
                i *= 2;
            }
        }
    }
}
