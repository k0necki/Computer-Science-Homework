/*
Входные данные
    Вводятся 4 числа: a, b, c и d.

Выходные данные
    Найдите все целые решения уравнения ax3 + bx2 + cx + d = 0 на отрезке [0,1000] и выведите их в порядке убывания.
    Если на данном отрезке нет ни одного решения, то ничего выводить не нужно.
 */

public class DescEquation {
    public static void main(String[] args) {

        int a = 1;
        int b = -5;
        int c = 6;
        int d = 0;
        int value;

        for (int x = 1000; x >= 0; x--) {
            value = (int) (a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d);
            if (value == 0) {
                System.out.println(x);
            }
        }
    }
}
