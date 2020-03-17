/*
Выведите все точные квадраты натуральных чисел, не превосходящие данного числа N.

Входные данные
    Задано единственное целое число N

Выходные данные
    Необходимо вывести  все точные квадраты натуральных чисел, не превосходящие данного числа N.
 */

import java.util.Scanner;

public class ListOfSquares {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите число N ");
        int n = s.nextInt();
        int i = 0;
        int squares;

        while (i * i < n) {
            squares = i * i;
            i++;
            System.out.println(squares);
        }
    }
}
