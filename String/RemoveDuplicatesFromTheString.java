package String;
import java.util.*;
public class RemoveDuplicatesFromTheString {
    public static String removeDuplicates(String s)
    {
        HashSet<Character>set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<s.length() ; i++)
        {
            set.add(s.charAt(i));
        }
        for(Character ch : set)
        {
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("The String before removing the duplicates are :"+s);
        System.out.println("The String after removing the duplicates are :"+removeDuplicates(s));
        sc.close();
    }
    
}
