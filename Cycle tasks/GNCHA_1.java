/*
"ГНЧЭ-1"  – сложное электронное устройство,
выдающее каждую секунду очередное число последовательности 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5...
Ввиду дороговизны электронных комплектующих вам поручено разработать эмулятор для этого устройства.

Входные данные
    Дано количество секунд (от 1 до 1000000), которые работает генератор после включения.

Выходные данные
    Результат работы генератора
 */

import java.util.Scanner;

public class GNCHA_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ввдите число секунд работы генератора ");
        int time = s.nextInt();
        int count = 0;

        for (int i = 0; i < time; i++) {
            for (int j = 0; j < i; j++) {
                count += 1;
                System.out.println(i);
                if (count == time) {
                    break;
                }
            }
            if (count == time) {
                break;
            }
        }
    }
}
