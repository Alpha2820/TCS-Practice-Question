package Numbers;

import java.util.*;

public class PrimeFactorOfAGivenNumber {
    public static ArrayList<Integer> printPrimeFactor(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if ((n % i == 0) && (checkPrime(i))) {
                result.add(i);
            }
        }
        return result;
    }

    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The prime factors of a given number are " + printPrimeFactor(n));
        sc.close();
    }

}
/*
 * public static ArrayList<Integer> printPrimeFactor(int n) {
 * ArrayList<Integer> result = new ArrayList<>();
 * 
 * // Handle 2
 * if (n % 2 == 0) {
 * result.add(2);
 * while (n % 2 == 0) n /= 2;
 * }
 * 
 * // Handle odd numbers up to sqrt(n)
 * for (int i = 3; i * i <= n; i += 2) {
 * if (n % i == 0) {
 * result.add(i);
 * while (n % i == 0) n /= i; // This "drain" makes it O(sqrt(n))
 * }
 * }
 * 
 * if (n > 2) result.add(n);
 * return result;
 * }
 */
