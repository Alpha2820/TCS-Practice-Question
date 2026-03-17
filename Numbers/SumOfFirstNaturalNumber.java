package Numbers;
import java.util.*;

public class SumOfFirstNaturalNumber {
    public static long sum(int n)
    {
        return (long)n * (n+1)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        long naturalSum = sum(n);
        System.out.println("The sum of natural number till "+ n +" is "+naturalSum);
        sc.close();
    }
    
}
