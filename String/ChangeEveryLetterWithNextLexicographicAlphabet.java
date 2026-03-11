package String;
import java.util.*;

public class ChangeEveryLetterWithNextLexicographicAlphabet {
    public static String changeString(String s)
    {
        char ch [] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<s.length() ; i++)
        {
            char ch1 = ch[i];
            sb.append(++ch1);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("The String before changing the letter with next lexicographic alphabet is "+ s);
        System.out.println("The String after changing the next lexicographic alphabet is "+ changeString(s));
        sc.close();
    }

    
}
