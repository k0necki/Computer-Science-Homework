/*
Входные данные
Даны три целых числа, записанных в отдельных строках. Определите, сколько среди них совпадающих.

Выходные данные
Программа должна вывести одно из чисел: 3 (если все совпадают), 2 (если два совпадают) или 0 (если все числа различны).
*/

public class NumberOfEqualsOfThree {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 1;
        int i = 0;

        if (a == b) {
            i++;
        }
        if (a == c) {
            i++;
        }
        if (b == c) {
            i++;
        }
        if (i == 0 || i == 3) {
            System.out.println(i);
        }
        else {
            System.out.println(i + 1);
        }
    }
}
