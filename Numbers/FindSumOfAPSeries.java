package Numbers;

import java.util.Scanner;

public class FindSumOfAPSeries {
    public static long sum(int n, int a , int d)
    {
        long sum = (2L * a) + (long)(n-1)*d;
        return (n*sum)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term of AP series");
        int n = sc.nextInt();
        System.out.println("Enter the first term of an AP Series");
        int a = sc.nextInt();
        System.out.println("Enter the common difference of the AP Series");
        int d = sc.nextInt();
        System.out.println("The sum of the AP series is "+sum(n,a,d));
        sc.close();
    }
    
}
