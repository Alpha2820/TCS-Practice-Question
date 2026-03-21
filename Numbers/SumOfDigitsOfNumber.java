package Numbers;

import java.util.*;

public class SumOfDigitsOfNumber {
    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The sum of digits of a number is " + sumDigits(n));
        sc.close();
    }

}
