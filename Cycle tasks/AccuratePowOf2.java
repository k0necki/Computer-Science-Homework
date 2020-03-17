/*
Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.

Операцией возведения в степень пользоваться нельзя!

Входные данные
    Вводится натуральное число.

Выходные данные
    Выведите ответ на задачу.
 */

import java.util.Scanner;

public class AccuratePowOf2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число N ");
        int n = s.nextInt();
        int i = 1;
        boolean flag = false;

        while (i <= n) {
            if (i == n) {
                flag = true;
                System.out.println("Yes");
            }
            i *= 2;
        }
        if (!flag) {
            System.out.println("No");
        }

    }
}
