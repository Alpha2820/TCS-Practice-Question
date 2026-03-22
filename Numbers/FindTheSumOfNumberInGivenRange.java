package Numbers;

import java.util.*;

public class FindTheSumOfNumberInGivenRange {
    public static int sum(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the left starting point");
        int left = sc.nextInt();
        System.out.println("Enter the rgiht end point");
        int right = sc.nextInt();
        System.out.println("The sum of total number from given range is" + sum(left, right));
        sc.close();
    }

}
