/*
Входные данные
Даны три натуральных числа a, b, c, записанные в отдельных строках.
    Определите, существует ли неворожденный треугольник с такими сторонами.

Выходные данные
    Если треугольник существует, выведите строку YES, иначе выведите строку NO.
 */

public class Triangle {
    public static void main(String[] args) {

        int a = 3;
        int b = 9;
        int c = 6;

        if (a + b >= c && a + c >= b && b + c >= a) {
            System.out.println("Exist");
        }
        else {
            System.out.println("Does not exist");
        }
    }
}
