/*
Для клетки с координатами (x, y) в таблице размером M × N выведите координаты ее соседей. Соседними называются клетки, имеющие общую сторону.

Входные данные
    Даны натуральные числа M, N, x, y (1 ≤ x ≤ M ≤ 109, 1 ≤ y ≤ N ≤ 109).

Выходные данные
    В выходной файл выведите пары координат соседей этой клетки в произвольном порядке.
 */

public class NeighborsCoord {
    public static void main(String[] args) {

        int M = 3;
        int N = 3;
        int x = 2;
        int y = 2;

        if (y + 1 <= M) {
            System.out.println(x + ", " + (y + 1));
        }
        if (x + 1 <= N) {
            System.out.println((x + 1) + ", " + y);
        }
        if (y - 1 >= 0) {
            System.out.println(x + ", " + (y - 1));
        }
        if (x - 1 >= 0) {
            System.out.println((x - 1) + ", " + y);
        }
    }
}

