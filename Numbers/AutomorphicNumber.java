package Numbers;
import java.util.*;

public class AutomorphicNumber {
    public static boolean Automorphic(int n)
    {
        String num = Long.toString(n);
        String prod = Long.toString((long)n*n);
        return prod.endsWith(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        boolean check = Automorphic(n);
        if(check)
        {
            System.out.println("The given number is Automorphic Number");
        }
        else
        {
            System.out.println("The given number is not a Automorphic Number");
        }
        sc.close();
    }
    
}
