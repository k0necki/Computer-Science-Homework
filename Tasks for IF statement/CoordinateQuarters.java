/*
Даны координаты двух точек на плоскости, требуется определить, лежат ли они в одной координатной четверти или нет (все координаты отличны от нуля).

Входные данные
    Вводятся 4 числа: координаты первой точки (x1, y1) и координаты второй точки (x2, y2).

Выходные данные
    Программа должна вывести слово YES, если точки находятся в одной координатной четверти, в противном случае вывести слово NO.
 */

public class CoordinateQuarters {
    public static void main(String[] args) {

        int x1 = 3;
        int y1 = 3;
        int x2 = 5;
        int y2 = 1;
        boolean quater = false;

        if (x1 > 0 && x2 > 0) {
            if (y1 > 0 && y2 > 0 || y1 < 0 && y2 < 0) {
                quater = true;
            }
            else {
                quater = false;
            }
        }
        else {
            if (y1 > 0 && y2 > 0 || y1 < 0 && y2 < 0) {
                quater = true;
            }
            else {
                quater = false;
            }
        }

        if (quater) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
