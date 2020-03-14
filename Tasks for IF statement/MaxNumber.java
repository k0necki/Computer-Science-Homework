/*
Входные данные
    Даны два целых числа, каждое записано в отдельной строке.
Выходные данные
    Программа должна вывести число 1, если первое число больше второго, число 2, если второе
    больше первого, или число 0, если они равны.
 */

public class MaxNumber {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 4;
        if(num1 > num2) {
            System.out.println(1);
        }
        else if (num1 < num2) {
            System.out.println(2);
        }
        else {
            System.out.println(0);
        }
    }
}
