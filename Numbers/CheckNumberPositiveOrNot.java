package Numbers;

import java.util.*;

public class CheckNumberPositiveOrNot {
    public static boolean PosOrNot(int n) {
        return n > 0 ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("The number is zero (neither positive nor negative).");
        } else if (PosOrNot(n)) {
            System.out.println("The given number is positive");
        } else {
            System.out.println("The given number is negative");
        }
        sc.close();

    }

}
