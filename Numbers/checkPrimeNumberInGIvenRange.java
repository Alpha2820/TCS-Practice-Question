package Numbers;
import java.util.*;

public class checkPrimeNumberInGIvenRange {
    public static boolean checkPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i = 2 ; i*i<=n ; i++)
        {
            if((n%i)==0)
            {
                return false;
            }
        }
        return true;
    }
    public static ArrayList<Integer> printPrime(int start, int end)
    {
        ArrayList<Integer>result = new ArrayList<>();
        for(int i = start ; i<=end ; i++)
        {
            if(checkPrime(i))
            {
                result.add(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to start a range");
        int start = sc.nextInt();
        System.out.println("Enter the end number to which the code will run ");
        int end = sc.nextInt();
        ArrayList<Integer> prime = printPrime(start,end);
        System.out.println(prime);
        sc.close();
    }
    
}
