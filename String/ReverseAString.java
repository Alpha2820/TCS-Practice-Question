package String;
import java.util.*;
public class ReverseAString {
    public static String reverse(String s)
    {
        StringBuilder sb = new StringBuilder();
        char ch[] = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left<right)
        {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        for(int i = 0 ; i<ch.length ; i++)
        {
            sb.append(ch[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println("The string before it get reversed is "+s);
        System.out.println("The String after getting reversed is "+reverse(s));
        sc.close();

        
    }
    
}
