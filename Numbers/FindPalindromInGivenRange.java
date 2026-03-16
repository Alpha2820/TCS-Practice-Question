package Numbers;
import java.util.*;

public class FindPalindromInGivenRange {
    public static boolean checkPalindrom(int n)
    {
        int copy = n;
        int sum = 0 ;
        while(n!=0)
        {
            int rem = n%10;
            sum = (sum * 10) + rem;
            n = n / 10;
        }
        return sum == copy;
    }
    public static ArrayList<Integer> printPalindrom(int start , int end)
    {
        ArrayList<Integer>result = new ArrayList<>();
        for(int i = start ; i<=end ; i++)
        {
            if(checkPalindrom(i))
            {
                result.add(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting point of the range");
        int start = sc.nextInt();
        System.out.println("Enter the ending point of the range");
        int end = sc.nextInt();
        System.out.println("The number of palindrom number present in the rnage from "+start+" and to the end is "+end+" is ");
        ArrayList<Integer> palindrome = printPalindrom(start, end);
        System.out.println(palindrome);
        sc.close();
    }
}
