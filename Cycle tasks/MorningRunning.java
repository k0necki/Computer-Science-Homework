/*
В первый день спортсмен пробежал x километров,
а затем он каждый день увеличивал пробег на 10% от предыдущего значения.
По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.

Входные данные
    Программа получает на вход действительные числа x и y

Выходные данные
    Программа должна вывести одно натуральное число.
 */

import java.util.Scanner;

public class MorningRunning {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите начальную дистанцию пробежки X ");
        double x = s.nextInt();
        System.out.println("Введите начальную дистанцию пробежки Y ");
        double y = s.nextInt();

        int day = 1;

        while (x <= y) {
            x *= 1.1;
            day += 1;
            if (x >= y) {
                System.out.println(day);
                break;
            }
        }
    }
}
