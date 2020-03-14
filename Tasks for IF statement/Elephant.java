/*
Требуется определить, бьет ли слон, стоящий на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.

Входные данные
    Вводятся четыре числа: координаты слона и координаты другой фигуры. Координаты - целые числа в интервале от 1 до 8.

Выходные данные
    Требуется вывести слово YES, если слон способен побить фигуру за 1 ход, в противном случае вывести слово NO
 */

public class Elephant {
    public static void main(String[] args) {
        int[] elephant_position = {1, 1};
        int[] figure_position = {5, 5};

        if(elephant_position[0] - figure_position[0] == elephant_position[1] - figure_position[1]) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
