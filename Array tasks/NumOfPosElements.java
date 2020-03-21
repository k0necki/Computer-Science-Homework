/*
Дан массив, состоящий из целых чисел. Напишите программу,
которая подсчитывает количество положительных чисел среди элементов массива.

Входные данные
    Сначала задано число N — количество элементов в массиве (1 <= N <= 10000).
    Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
    Необходимо единственное число - количество положительных элементов в массиве.
 */

import java.util.Scanner;

public class NumOfPosElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10000 ");
        int N = s.nextInt();

        int i;
        int sum = 0;
        int[] array = new int[N];

        for (i = 0; i < array.length; i++) {
            System.out.println("Введите элемент массива ");
            array[i] = s.nextInt();

            if (array[i] > 0) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
