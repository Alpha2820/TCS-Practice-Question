package Numbers;
import java.util.*;

public class PrintFibonacci {
    public static void printFibo(int n)
    {
        // 0 1 1 2 3 5 8 ...
        int a = 0;
        System.out.print(a+" ");
        int b = 1;
        System.out.print(b+" ");
        for(int i = 3 ; i<=n ; i++)
        {
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want to print the fibonacci series");
        int n = sc.nextInt();
        System.out.println("The fibonacci series would be ");
        printFibo(n);
        sc.close();
    }

    
}
