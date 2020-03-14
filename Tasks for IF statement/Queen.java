/*
Требуется определить, бьет ли ферзь, стоящий на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.

Входные данные
    Вводятся четыре числа: координаты ферзя и координаты другой фигуры. Координаты - целые числа в интервале от 1 до 8.

    Выходные данные
Требуется вывести слово YES, если ферзь может побить фигуру за 1 ход, в противном случае вывести слово NO
 */

public class Queen {
    public static void main(String[] args) {

        int[] queen_position = {3, 2};
        int[] figure_position = {8, 3};

        if(queen_position[0] == figure_position[0] || queen_position[1] == figure_position[1] || queen_position[0] - figure_position[0] == queen_position[1] - figure_position[1]) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
