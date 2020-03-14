/*
Входные данные
    Вводится натуральное число x.

Выходные данные
    Выведите наименьший делитель числа x, отличный от 1.
 */

public class MinDiv {
    public static void main(String[] args) {

        int x = 15;

        for (int i = 2; i <= 30000; i++) {
            if (x % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
