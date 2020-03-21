/*
Дан массив, состоящий из целых чисел. Напишите программу,
которая в данном массиве определит количество элементов,
у которых два соседних и, при этом, оба соседних элемента меньше данного.

Входные данные
    Сначала задано число N — количество элементов в массиве (1 <= N <= 100).
    Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
    Необходимо вывести количество элементов массива,
    у которых два соседа и которые при этом строго больше обоих своих соседей.
 */

import java.util.Scanner;

public class ElementsLargerThanNeighbours {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число от 1 до 100 ");
        int N = s.nextInt();

        int i;
        int sum = 0;
        int[] array = new int[N];

        for (i = 0 ; i < array.length; i++) {
            System.out.println("Введите элементы массива ");
            int n = s.nextInt();
            array[i] = n;
        }
        for (i = 1 ; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
