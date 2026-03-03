package String;
import java.util.*;

public class RemoveCharacterFromAString {
    public static String removeCharacter(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<s.length() ; i++)
        {
            char ch = s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the given String ");
        String s = sc.nextLine();
        System.out.println("The String before removing the spaces other than Alphabets are "+s);
        System.out.println("The String after removing the spaces other than alphabets are "+removeCharacter(s));
        sc.close();

    }
    
}
