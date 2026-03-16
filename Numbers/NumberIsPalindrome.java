package Numbers;
import java.util.*;
public class NumberIsPalindrome {
    public static boolean palindrome(int n)
    {
        int copy = n;
        int sum = 0;
        while(n!=0)
        {
            int rem = n%10;
            sum = (sum * 10) + rem;
            n = n/10;
        }
        return sum == copy;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        boolean check = palindrome(n);
        if(check)
        {
            System.out.println("The number entered by the user is palindrome");
        }
        else
        {
            System.out.println("The number is not palindrome");
        }
        sc.close();
    }
    
}
