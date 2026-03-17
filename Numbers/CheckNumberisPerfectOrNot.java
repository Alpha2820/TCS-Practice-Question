package Numbers;
import java.util.*;

public class CheckNumberisPerfectOrNot {
    public static boolean perfect(int n)
    {
        if(n<=0)
        {
            return false;
        }
        int copy = n;
        int sum = 0;
        for(int i = 1;  i<n ; i++)
        {
            if(n%i==0)
            {
                sum += i;
            }
        }
        return sum == copy;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean check = perfect(n);
        if(check)
        {
            System.out.println("The number is a perfect number");
        }
        else
        {
            System.out.println("The number is not a perfect number");
        }
        sc.close();
    }
    
}
