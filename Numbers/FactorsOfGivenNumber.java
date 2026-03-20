package Numbers;
import java.util.*;

public class FactorsOfGivenNumber {
    public static ArrayList<Integer> factor(int n)
    {
        ArrayList<Integer>result = new ArrayList<>();
        for(int i = 1 ; i*i<=n ; i++)
        {
            if(n%i==0)
            {
                result.add(i);
                if(i!=n/i)
                {
                    result.add(n/i);
                }
            }
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The factor of a given number is "+factor(n));
        sc.close();
    }
    
}
