/*
Дан массив, состоящий из целых чисел. Нумерация элементов начинается с 0.
Напишите программу, которая выведет элементы массива, номера которых четны (0, 2, 4...).

Входные данные
    Сначала задано число N — количество элементов в массиве (1 <= N <= 100).
    Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
    Необходимо вывести все элементы массива с чётными номерами.
 */

import org.omg.CORBA.MARSHAL;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число от 1 до 100 ");
        int N = s.nextInt();
        int i;

        int[] array = new int[N];

        // Заполниние массива в промежутке
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
            System.out.println(array[i]);
        }
        System.out.println(); // Проверка
        for (i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
