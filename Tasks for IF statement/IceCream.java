/*
В кафе мороженое продают по три шарика и по пять шариков. Можно ли купить ровно k шариков мороженого?

Входные данные
    Вводится число k (целое,положительное)

Выходные данные
    Программа должна вывести слово YES, если при таких условиях можно набрать ровно k шариков (не больше и не меньше),
    в противном случае - вывести NO.
 */

public class IceCream {
    public static void main(String[] args) {

        int ice_cream_count = 161;
        boolean if_buy = false;

        for(int i = 0; i <= ice_cream_count / 5; i++) {
            if((ice_cream_count - i * 5) % 3 == 0) {
                if_buy = true;
            }
        }
        if(if_buy) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
