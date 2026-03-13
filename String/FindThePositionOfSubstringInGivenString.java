package String;
import java.util.*;

public class FindThePositionOfSubstringInGivenString {
    public static int position(String s1 , String s2)
    {
        if(s2.contains(s1))
        {
            return s2.indexOf(s1);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string");
        String s2 = sc.nextLine();
        System.out.println("The substring position which is present in String is at position "+ position(s1,s2));
        sc.close();
    }
    
}
