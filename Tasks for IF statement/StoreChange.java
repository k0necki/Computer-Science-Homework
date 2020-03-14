/*
Товар стоит a руб. b коп. За него заплатили c руб. d коп. Сколько сдачи требуется получить?

Входные данные
    Вводятся 4 числа: a, b, c и d.

Выходные данные
    Необходимо вывести 2 числа: e и f, число рублей и копеек, соответственно.
 */

public class StoreChange {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 2;
        int d = 2;
        int e = c - a;
        int f = d - b;

        System.out.println("Ваша сдача " + e + "руб " + f + "коп ");

    }
}
