/*
Определите тип треугольника (остроугольный, тупоугольный, прямоугольный) с данными сторонами.

Входные данные
    Даны три натуральных числа – стороны треугольника.

Выходные данные
    Необходимо вывести одно из слов: rectangular для прямоугольного треугольника,
    acute для остроугольного треугольника, obtuse для тупоугольного треугольника или impossible,
    если входные числа не образуют треугольника.
 */

public class TriangleType {
    public static void main(String[] args) {

        int a = 2;
        int b = 1;
        int c = 8;

        if (a + b > c && a + c > b || b + c > a) {
            if (c * c == a * a + b * b) {
                System.out.println("rectangular");

            }
            else if ( c * c > a * a + b * b) {
                System.out.println("obtuse");
            }
            else {
                System.out.println("acute");
            }
        }
        else {
            System.out.println("Error");
        }
    }
}
