package Numbers;

import java.util.*;

public class PermutationsInWHichNPeopleCanOccupyRSeatsInAClassroom {
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static long permutation(int n, int r) {
        if (r > n)
            return 0;
        return (long) factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N");
        int N = sc.nextInt();
        System.out.println("Enter the R");
        int R = sc.nextInt();
        System.out.println("The permutation in which " + N + " people can occupy " + R + " seats in a classroom"
                + permutation(N, R));
        sc.close();
    }

}
