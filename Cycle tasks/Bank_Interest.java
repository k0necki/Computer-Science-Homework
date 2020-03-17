/*
Вклад в банке составляет x рублей. Ежегодно он увеличивается на p процентов,
после чего дробная часть копеек отбрасывается. Каждый год сумма вклада становится больше.
Определите, через сколько лет вклад составит не менее y рублей.

Входные данные
    Программа получает на вход три натуральных числа: x, p, y.

Выходные данные
    Программа должна вывести одно целое число.
 */

import java.util.Scanner;

public class Bank_Interest {
    public static void main(String[] args) {

        double x = 100;
        double p = 10;
        double y = 200;
        int year = 0;

        while (x <= y) {
            x *= 1 + (p / 100);
            year += 1;
            if (x >= y) {
                System.out.println(year);
            }
        }
    }
}
