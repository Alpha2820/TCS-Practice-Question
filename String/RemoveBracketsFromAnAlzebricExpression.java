package String;
import java.util.*;

public class RemoveBracketsFromAnAlzebricExpression {
    public static String removeBrackets(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<s.length() ; i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)==')')
            {
                continue;
            }
            else
            {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("The string before removing the brackets are "+s);
        System.out.println("The String after removing the brackets are "+ removeBrackets(s));
        sc.close();

    }
    
}
