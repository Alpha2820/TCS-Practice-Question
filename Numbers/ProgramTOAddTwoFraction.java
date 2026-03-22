package Numbers;

import java.util.*;

public class ProgramTOAddTwoFraction {
    public static int gcd(int num1, int num2) {
        int greatest = 1;
        for (int i = Math.min(num1, num2); i >= 1; i--) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                greatest = i;
                return greatest;
            }
        }
        return greatest;

    }

    public static int lcm(int num1, int num2) {
        return Math.abs(num1 * num2) / gcd(num1, num2);

    }

    public static void addFraction(int num1, int deno1, int num2, int deno2) {
        // 1. Find the common denominator
        int commonDeno = lcm(deno1, deno2);

        // 2. Adjust numerators and add them
        int sumNum = (num1 * (commonDeno / deno1)) + (num2 * (commonDeno / deno2));

        // 3. Simplify the result
        int commonDivisor = gcd(sumNum, commonDeno);
        int finalNum = sumNum / commonDivisor;
        int finalDeno = commonDeno / commonDivisor;

        System.out.println("The result is: " + finalNum + "/" + finalDeno);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Numerator");
        int numerator1 = sc.nextInt();
        System.out.println("Enter first denominator");
        int denominator1 = sc.nextInt();
        System.out.println("Enter second Numerator");
        int numerator2 = sc.nextInt();
        System.out.println("Enter the second denominator");
        int denominator2 = sc.nextInt();
        System.out.println(
                "The fractions after adding is" + addFraction(numerator1, denominator1, numerator2, denominator2));
        sc.close();
    }

}
