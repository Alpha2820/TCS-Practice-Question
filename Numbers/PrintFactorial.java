package Numbers;

import java.util.*;

public class PrintFactorial {
    public static int fact(int n) {
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod = prod * i;
        }
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The Factorial of a number is " + fact(n));
        sc.close();
    }

}
