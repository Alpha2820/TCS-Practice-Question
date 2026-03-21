package Numbers;

import java.util.*;

public class HarshadNumber {
    public static boolean harshad(int num) {
        if (num <= 0)
            return false;
        int copy = num;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        return copy % sum == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean check = harshad(n);
        if (check) {
            System.out.println("The given number is Harshad Number");
        } else {
            System.out.println("The Given number is not a Harshad Number");
        }
        sc.close();
    }
}
