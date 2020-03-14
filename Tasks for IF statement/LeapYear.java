// Требуется определить, является ли данный год високосным.
// (Напомним, что год является високосным, если его номер кратен 4, но не кратен 100, а также если он кратен 400.)

public class LeapYear {
    public static void main(String[] args) {

        int year = 2016; // Переменная для хранения номера года

        if (year % 4 != 0) {
            System.out.println("Не високосный");
        }
        else {
            if(year % 100 != 0) {
                System.out.println("Високосный");
            }
            else if(year % 400 == 0) {
                System.out.println("Високосный");
            }
            else {
                System.out.println("Не високосный");
            }
        }
    }
}
