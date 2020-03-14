/*
Входные данные
    Даны три целых числа, каждое записано в отдельной строке.

Выходные данные
    Выведите наибольшее из данных чисел (программа должна вывести ровно одно целое число).
 */

public class MaxOfThree {
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 0;
        int num3 = 12;
        if(num1 > num2) {
            if(num1 > num3) {
                System.out.println(num1);
            }
            else {
                System.out.println(num3);
            }
        }
        else {
            if(num2 > num3) {
                System.out.println(num2);
            }
            else {
                System.out.println(num3);
            }
        }
    }
}
