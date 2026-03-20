package Numbers;
import java.util.*;

public class PrimeFactorOfAGivenNumber {
    public static ArrayList<Integer> printPrimeFactor(int n)
    {
        ArrayList<Integer>result = new ArrayList<>();
        for(int i = 2 ; i<=n ; i++)
        {
            if((n%i==0)&&(checkPrime(i)))
            {
                result.add(i);
            }
        }
        return result;
    }
    public static boolean checkPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i = 2 ; i*i<=n ; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The prime factors of a given number are "+printPrimeFactor(n));
        sc.close();
    }
    
}
