public class Calculator {
    // свойства

    // методы (функции)

    public static void main(String[] args) {
        System.out.println(parse_diff("5 * 7"));
        System.out.println(parse_diff("5 / 7"));
        System.out.println(parse_diff("5 ^ 3"));
        System.out.println(parse_simple("4 !"));
        System.out.println(parse_simple("4 sqr"));

    }
    // модиикатор, тип данных который функция возвращает, название функции,(данные которые передаются в функию)
    private static double sum(double x, double y) {
        return x + y;
    }

    private static double sub(double x, double y) {
        return x - y;
    }

    private static double mult(double x, double y) {
        return  x * y;
    }

    private static double div(double x, double y) {
        return x / y;
    }

   private static double pow(double x, double p) {
//            return Math.pow(x, p);
       double answer = 1;
       for (int i = 0; i < p; i++) {
           answer *= x;
       }
       return answer;
    }

    private static int factorial(double x) {
        int f = 0;
        for (int i = 0; i <= x; i++) {
            f += i;
        }
        return f;
    }

    private static double sqr(double x) {
        return Math.sqrt(x);
    }

    public static  double parse_simple(String s) {
        double answer = 0;
        String[] parse = new String[2];
        parse = s.split(" ",  2);

        if (parse[1].equals("!")) {
            answer = factorial(Double.valueOf(parse[0]));
        }
        else if (parse[1].equals("sqr")) {
            answer = sqr(Double.valueOf(parse[0]));
        }
        return  answer;
    }

    public static double parse_diff(String s) {
        double answer = 0;
        String[] parse = new String[3];
        parse = s.split(" ", 3);

        if (parse[1].equals("+")) {
            answer = sum(Double.valueOf(parse[0]), Double.valueOf(parse[2]));
        }
        else if (parse[1].equals("-")) {
            answer = sub(Double.valueOf(parse[0]), Double.valueOf(parse[2]));
        }
        else if (parse[1].equals("*")) {
            answer = mult(Double.valueOf(parse[0]), Double.valueOf(parse[2]));
        }
        else if (parse[1].equals("/")) {
            answer = div(Double.valueOf(parse[0]), Double.valueOf(parse[2]));
        }
        else if (parse[1].equals("^")) {
            answer = pow(Double.valueOf(parse[0]), Double.valueOf(parse[2]));
        }
        return answer;
    }


}
