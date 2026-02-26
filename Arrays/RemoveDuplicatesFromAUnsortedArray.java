package Arrays;
import java.util.*;

public class RemoveDuplicatesFromAUnsortedArray {
    public static Set<Integer> unique(int arr[])
    {
        HashSet<Integer>set = new HashSet<>();
        for(int i = 0 ; i<arr.length ; i++)
        {
            set.add(arr[i]);
        }
        return set;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in an Array");
        for(int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The unique elements present in the Array is "+unique(arr));
        sc.close();
    }
}
