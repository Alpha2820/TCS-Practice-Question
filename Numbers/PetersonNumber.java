package Numbers;
import java.util.*;

public class PetersonNumber {
    public static int fact(int n)
    {
        int fact = 1;
        for(int i = 1; i<=n ; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
    public static boolean peterson(int n)
    {
        int copy = n;
        int sum = 0;
        while(n!=0)
        {
            int rem = n%10;
            sum += fact(rem);
            n = n / 10;
        }
        return sum==copy;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean check = peterson(n);
        if(check)
        {
            System.out.println("The given number is Strong Number");
        }
        else
        {
            System.out.println("The given number is not a Strong Number");
        }
        sc.close();
    }
}
