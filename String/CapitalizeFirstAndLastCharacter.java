package String;
import java.util.*;

public class CapitalizeFirstAndLastCharacter {
    public static String capitalize(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0 ; i<sb.length() ; i++)
        {
            if(i==0 || sb.charAt(i-1)==' ')
            {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
            if(i == sb.length()-1 || sb.charAt(i+1)== ' ')
            {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("The String before capitalizing first and Last character of the String is "+s);
        System.out.println("The String after capitalizing first and last of a characater of String is "+ capitalize(s));
        sc.close();
    }
    
}
