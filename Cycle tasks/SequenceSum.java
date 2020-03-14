/*
По данному натуральному числу N найдите сумму чисел 1+1/1!+1/2!+1/3!+...+1/N!.
Количество действий должно быть пропорционально N.

Входные данные
Задано единственное число N

Выходные данные
    Необходимо вывести  результат вычисления в виде действительного числа.
 */

public class SequenceSum {
    public static void main(String[] args) {
        int N = 10;
        double sum = 1;
        double factorial = 0;

        for (int i = 1; i <= N; i++) {
            factorial += i;
            sum += 1 / factorial;
        }
        System.out.println(sum);
    }
}
