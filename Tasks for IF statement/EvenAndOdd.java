/*
Даны три целых числа A, B, C. Определить, есть ли среди них хотя бы одно четное и хотя бы одно нечетное.

Входные данные
    Числа A, B, C, не превышающие по модулю 10000.

Выходные данные
    Одна строка – "YES" или "NO".
*/

public class EvenAndOdd {
    public static void main(String[] args) {

        int a = 2;
        int b = 2;
        int c = 5;
        boolean if_even = false;
        boolean if_odd = false;

        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            if_even = true;
        }
        if (a % 2 != 0 || b % 2 != 0 || c % 2 != 0) {
            if_odd = true;
        }
        if (if_even && if_odd) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
