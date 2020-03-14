/*
Решить в целых числах уравнение ax + b = 0.

Входные данные
    Вводятся 2 целых числа: a и b.

Выходные данные
    Необходимо вывести все решения, если их число конечно, “NO” (без кавычек),
    если решений нет, и “INF” (без кавычек), если решений бесконечно много.
 */

public class Equation {
    public static void main(String[] args) {

        int a = 6;
        int b = 0;
        int x = b/a;

        if(Math.abs(x) > 0) {
            System.out.println(x);
        }
        else if(Math.abs(x) < 0) {
            System.out.println("No");
        }
        else {
            System.out.println("Inf");
        }
    }
}
