/*
Дан массив, состоящий из целых чисел. Известно, что числа упорядочены по неубыванию
(то есть каждый следующий элемент не меньше предыдущего). Напишите программу,
которая определит количество различных чисел в этом массиве.

Входные данные
    Сначала задано число N — количество элементов в массиве (1 <= N <= 100).
    Далее через пробел записаны N чисел — элементы массива.
    Массив состоит из целых чисел, находящихся в пределах от −2^31 до (2^31) − 1

Выходные данные
    Необходимо вывести единственное число - количество различных чисел в массиве.
 */

import java.util.Scanner;

public class AmountOfDifferElements {
    public static void main(String[] args) {
        int i;
        int sum = 1;
        int[] array = {4, 6, 6, 7, 9, 10, 11, 13, 13,};

        for (i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}