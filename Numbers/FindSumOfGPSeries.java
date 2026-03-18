package Numbers;

import java.util.*;

public class FindSumOfGPSeries {
    public static long sum(int a, int r, int n) {
        if (r == 1) {
            return (long) a * n;
        }
        long sum = a * ((long) Math.pow(r, n) - 1);
        return sum / (r - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first termp of GP series");
        int a = sc.nextInt();
        System.out.println("Enter the common ration of GP series");
        int r = sc.nextInt();
        System.out.println("Enter the nth term of GP Series");
        int n = sc.nextInt();
        System.out.println("The sum of the GP series is " + sum(a, r, n));
        sc.close();
    }
}
