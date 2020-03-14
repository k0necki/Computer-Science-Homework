/*
Даны действительные числа a, b, c. Найдите все решения квадратного уравнения ax2 + bx + c = 0.

Входные данные
    Даны три действительных числа, a не равно 0.

Выходные данные
    Выведите два действительных числа, если уравнение имеет два корня,
    одно действительное число – при наличии одного корня. При отсутствии действительных корней ничего выводить не нужно.
 */

import java.util.Scanner;

public class QuadEquation {
    public static void main(String[] args) {

        double a, b, c, D;

        Scanner s = new Scanner(System.in);
        System.out.println("Введите переменную a");
        a = s.nextInt();
        System.out.println("Введите переменную b");
        b = s.nextInt();
        System.out.println("Введите переменную c");
        c = s.nextInt();

        D = (b * b) - (4 * a * c);

        if(D > 0) {
            System.out.println("Есть 2 корня");
            double x1, x2;
            x1 = ((-b) + Math.sqrt(D)) / (2 * a);
            x2 = ((-b) - Math.sqrt(D)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }
        else if(D == 0) {
            System.out.println("Есть корень");
            double x;
            x = ((-b) + Math.sqrt(D)) / (2 * a);
            System.out.println(x);
        }
        else {
            System.out.println("Нет корней");
        }
    }
}
