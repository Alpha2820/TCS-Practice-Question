package String;
import java.util.*;
public class RemoveSpacesFromAStrong {
    public static String removeSpace(String s)
    {
        String result = "";
        for(int i = 0 ; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                result = result + ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("The String before removing the spaces are "+s);
        System.out.println("The String after removing the spaces are "+removeSpace(s));
        sc.close();
    }
    
}
