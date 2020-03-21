/*
Вводится массив, состоящий из целых чисел. Найти наибольшее среди них.

Входные данные
    Сначала задано число N — количество элементов в массиве (1 <= N <= 35).
    Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
    Необходимо вывести значение наибольшего элемента в массиве.
 */


import java.util.Scanner;

public class Max_In_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число от 1 до 35 ");
        int N = s.nextInt();

        int i;
        int[] array = new int[N];
        int max = 0;

        for (i = 0; i < array.length; i++) {
            System.out.println("Введите элементы массива ");
            array[i] = s.nextInt();
        }
        for (i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                max = array[i];
            }
            else {
                max = array[i + 1];
            }
        }
        System.out.println(max);
    }
}
