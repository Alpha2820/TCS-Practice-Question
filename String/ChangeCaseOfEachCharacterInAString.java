package String;
import java.util.*;

public class ChangeCaseOfEachCharacterInAString {
    public static String convertCase(String s)
    {
        StringBuilder sb =  new StringBuilder();
        for(int i = 0 ; i<s.length() ; i++)
        {
            int ascii = (int)s.charAt(i);
            if(ascii >= 65 && ascii <= 90)
            {
                sb.append((char)(ascii + 32));
            }
            else if(ascii >= 97 && ascii <= 122)
            {
                sb.append((char)(ascii-32));
            }
            else if(s.charAt(i)==' ')
            {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("The String before Changing the case of every Character in a String is "+ s);
        System.out.println("The String after the chaning the case of each character in a String is "+ convertCase(s));
        sc.close();
    }
    
}
