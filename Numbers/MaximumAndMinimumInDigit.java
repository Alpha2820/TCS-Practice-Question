package Numbers;

import java.util.*;

public class MaximumAndMinimumInDigit {
    public static int min(int num) {
        num = Math.abs(num); // Safety first!
        if (num == 0)
            return 0; // Quick exit for zero
        int minNum = Integer.MAX_VALUE;
        while (num != 0) {
            int rem = num % 10;
            minNum = Math.min(minNum, rem);
            num = num / 10;
        }
        return minNum;
    }

    public static int max(int num) {
        num = Math.abs(num); // Safety first!
        if (num == 0)
            return 0; // Quick exit for zero
        int maxNum = Integer.MIN_VALUE;
        while (num != 0) {
            int rem = num % 10;
            maxNum = Math.max(maxNum, rem);
            num = num / 10;
        }
        return maxNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("The maximum number present in the number is " + max(num));
        System.out.println("The minimum number present in the number is " + min(num));
        sc.close();
    }
}
