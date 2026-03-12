package String;
import java.util.*;

public class ConcatenateTwoString {
    public static String concatenate(String s1, String s2)
    {
        if(s1.isEmpty())
        {
            return s2;
        }
        if(s2.isEmpty())
        {
            return s1;
        }
        if(s1.isEmpty() && s2.isEmpty())
        {
            return "";
        }
        return s1+s2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String");
        String s1 = sc.nextLine();
        System.out.println("Enter the Second String");
        String s2 = sc.nextLine();
        System.out.println("The two String before concatenation are "+s1 + " " + s2);
        System.out.println("The Two String after concatenation are "+concatenate(s1,s2));
        sc.close();

    }
    
}
