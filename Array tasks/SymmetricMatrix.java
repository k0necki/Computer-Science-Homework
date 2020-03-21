/*
Проверьте, является ли двумерный массив симметричным относительно главной диагонали.
Главная диагональ — та, которая идёт из левого верхнего угла двумерного массива в правый нижний.

Входные данные
    Программа получает на вход число n  100, являющееся числом строк и столбцов в массиве.
    Далее во входном потоке идет n строк по n чисел, являющихся элементами массива.

Выходные данные
Программа должна выводить слово yes для симметричного массива и слово no для несимметричного.
 */

import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число от 1 до 100 ");
        int N = s.nextInt();

        boolean is_symmetric = false;

        int[][] array = new int[N][N];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Строка " + i);
            for (int j = 0; j < array[0].length; j++) {
                System.out.println("Столбец " + j);
                array[i][j] = s.nextInt();
            }
        }
//        Вывод массива
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[0].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i != j ) {
                    if (array[i][j] == array[j][i]) {
                        is_symmetric = true;
                    }
                    else {
                        is_symmetric = false;
                    }
                }
            }
        }
        if (is_symmetric) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
