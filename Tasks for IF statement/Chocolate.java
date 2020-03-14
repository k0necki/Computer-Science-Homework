/*
Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек,
если разрешается сделать один разлом по прямой между дольками (то есть разломить шоколадку на два прямоугольника).

Входные данные
    Вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек в шоколадке не превосходит 30000.

Выходные данные
    Программа должна вывести слово YES, если возможно отломить указанное число долек, в противном случае вывести слово NO.
 */

public class Chocolate {
    public static void main(String[] args) {

        int n = 3;
        int m = 5;
        int k = 4;

        if (k % n == 0 || k % m == 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}