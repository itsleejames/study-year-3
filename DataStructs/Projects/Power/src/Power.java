public class Power {


    public static void main(String[] args) {
//        System.out.println(power(3, 4));
//        System.out.println(power(2, 5));
//        System.out.println(power(4, 2));
        System.out.println(gcd(100, 70));
        System.out.println(gcd(8, 16));
        System.out.println(gcd(49, 15));
    }


    // Exercise 1
    public static int power(int base, int exponent) {
        if (exponent == 1) {
            return base;

        } else {
            return base * power(base, exponent - 1);
        }
    }

    // Exercise 2
    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }

    }
    //Exercise 3
    public static int reverseNumbers(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.println(number % 10);
            System.out.println(reverseNumbers(number / 10));

        }
    }

}
