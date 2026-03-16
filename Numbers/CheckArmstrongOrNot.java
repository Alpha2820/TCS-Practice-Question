package Numbers;
import java.util.*;

public class CheckArmstrongOrNot {
    public static int count(int n)
    {
        int count = 0;
        while(n!=0)
        {
            count++;
            n = n / 10;
        }
        return count;
    }
    public static boolean checkArmstrong(int n)
    {
        int countDigit = count(n);
        int copy = n;
        int sum = 0;
        while(n!=0)
        {
            int rem = n%10;
            sum = sum + (int)Math.pow(rem,countDigit);
            n = n / 10;
        }
        return sum == copy;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean check = checkArmstrong(n);
        if(check)
        {
            System.out.println("The number is Armstrong number");
        }
        else
        {
            System.out.println("The number is not an Armstrong number");
        }
        sc.close();
    }
    
}
