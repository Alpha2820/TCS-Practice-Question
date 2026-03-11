package String;
import java.util.*;

public class LargestWordInAString {
    public static String largestWord(String s)
    {
        String str[] = s.split(" ");
        String longest = str[0];
        for(int i = 1;  i<str.length ; i++)
        {
            if(str[i].length()>longest.length())
            {
                longest = str[i];
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("The largest word in a given string is "+largestWord(s));
        sc.close();
    }
    
}
