/*
Напишите программу, которая переставляет элементы массива в обратном порядке
без использования дополнительного массива. Программа должна считать массив,
поменять порядок его элементов, затем вывести результат
(просто вывести элементы массива в обратном порядке – недостаточно!)

Входные данные
    Сначала задано число N — количество элементов в массиве (1 <= N <= 35).
    Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
    Необходимо вывести массив, полученный после перестановки элементов.
 */

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число от 1 до 35 ");
        int N = s.nextInt();

        int i;
        int[] array = new int[N];

        int buffer;

        for (i = 0; i < array.length; i++) {
            System.out.println("Введите элемент массива ");
            int n = s.nextInt();
            array[i] = n;
        }

        for (i = 0; i < array.length / 2; i++) {
            buffer = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = buffer;
        }
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
