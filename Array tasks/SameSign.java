/*
Дан массив, состоящий из целых чисел. Напишите программу,
которая определяет, есть ли в массиве пара соседних элементов с одинаковыми знаками.

Входные данные
    Сначала задано число N — количество элементов в массиве (1 <= N <= 10000).
    Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
    Необходимо вывести слово YES, если существует пара соседних элементов с одинаковыми знаками.
    В противном случае следует вывести слово NO.
 */

import java.util.Scanner;

public class SameSign {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10000 ");
        int N = s.nextInt();

        int i;
        int[] array = new int[N];
        boolean is_pair = false;

        for (i = 0; i < array.length; i++) {
            System.out.println("Введите элементы массива ");
            array[i] = s.nextInt();
        }
        for (i = 0; i < array.length - 1; i++) {
            if (array[i] * array[i + 1] >= 0) {
                is_pair = true;
                break;
            }
        }
        if (is_pair) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
