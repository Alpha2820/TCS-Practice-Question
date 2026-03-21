package Numbers;

import java.util.*;

public class LowestCommonMultiple {
    public static int gcd(int num1, int num2) {
        int great = 1;
        for (int i = Math.min(num1, num2); i >= 1; i--) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                great = i;
                return great;
            }
        }
        return great;
    }

    public static int lcm(int num1, int num2) {
        return Math.abs(num1 * num2) / gcd(num1, num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fisrt number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        System.out.println("The lowest common multiple of a given number are " + lcm(n1, n2));
        sc.close();
    }

}
