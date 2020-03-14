/*
Входные данные
    Вводятся 5 чисел: a, b, c, d и e.

Выходные данные
    Найдите все целые решения уравнения ( ax3 + bx2 + cx + d ) / ( x - e ) = 0
    на отрезке [0,1000] и выведите их количество.
 */

public class DecisionsNum {
    public static void main(String[] args) {

        int a = 1;
        int b = -5;
        int c = 600;
        int d = 76;
        int e = 1000;
        int value;
        int count = 0;


        for (int x = 0; x <= 1000; x++) {
            if (x != e) {
                value = (int) ((a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d )/ (x - e));
                if (value == 0) {
                    count += 1;

                }
            }
        }
        System.out.println(count);
    }
}
