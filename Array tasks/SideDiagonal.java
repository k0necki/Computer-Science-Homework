/*
Дано число n, n  100 . Создайте массив n×n и заполните его по следующему правилу:
- числа на диагонали, идущей из правого верхнего в левый нижний угол, равны 1;
- числа, стоящие выше этой диагонали, равны 0;
- числа, стоящие ниже этой диагонали, равны 2.

Входные данные
    Программа получает на вход число n.

Выходные данные
    Необходимо вывести  полученный массив. Числа разделяйте одним пробелом.
 */

import java.util.Scanner;

public class SideDiagonal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число от 1 до 100 ");
        int N = s.nextInt();

        int[][] array = new int[N][N];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i > j) {
                    array[i][j] = 2;
                }
                else if (i < j ) {
                    array[i][j] = 0;
                }
                else {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
