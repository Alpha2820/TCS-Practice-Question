package String;
import java.util.*;

public class RemoveAllCharacterFromFirstStringPresentInTheSecondString {
    public static String removeCharacters(String s1, String s2)
    {
        HashSet<Character>set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<s2.length() ; i++)
        {
            set.add(s2.charAt(i));
        }
        for(int i = 0 ; i<s1.length() ; i++)
        {
            if(!set.contains(s1.charAt(i)))
            {
                sb.append(s1.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String s1 = sc.nextLine();
        System.out.println("Enter the Second String");
        String s2 = sc.nextLine();
        System.out.println("The remaining String after removing character from the first string present in the second String is "+removeCharacters(s1,s2));
        sc.close();
    }
}
