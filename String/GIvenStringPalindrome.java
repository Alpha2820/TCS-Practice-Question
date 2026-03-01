package String;
import java.util.*;

public class GIvenStringPalindrome {
    public static boolean palindrome(String s)
    {
        int left = 0;
        int right = s.length()-1;
        while(left<=right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        boolean check = palindrome(s);
        if(check)
        {
            System.out.println("The given string is palindrome");
        }
        else
        {
            System.out.println("The given string is not palindrome");
        }
        sc.close();
    }
}
