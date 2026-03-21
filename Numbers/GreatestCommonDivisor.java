package Numbers;
import java.util.*;
public class GreatestCommonDivisor {
    
    public static int gcd(int num1 , int num2)
    {
        int common = -1;
        for(int i = Math.min(num1,num2) ; i<=num2 ; i++)
        {
            if((num1%i==0)&&(num2%i==0))
            {
                common = i;
                return common;
            }
        }
        return common;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        System.out.println("The Greater commone divisor between them are "+ gcd(n1,n2));
        sc.close();
    }

    
}
