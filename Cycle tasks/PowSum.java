/*
Входные данные
    Вводится натуральное число N, которое не превосходит 30.

Выходные данные
    Вычислите 1+2+2^2+2^3+…+2^N.
 */

public class PowSum {
    public static void main(String[] args) {

        int sum = 0;
        int value = 1;
        int N = 5;

        for (int i = 0; i <= N; i++) {
//          sum += Math.pow(2, i);
            for (int j = 1; j <= i; j++) {
                value *= 2;
            }
            sum += value;
            value = 1;
        }
        System.out.println(sum);
    }
}
