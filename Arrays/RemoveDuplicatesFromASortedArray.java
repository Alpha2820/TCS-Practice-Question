package Arrays;
import java.util.*;

public class RemoveDuplicatesFromASortedArray {
    public static int removeDuplicates(int arr[])
    {
        int i = 0;
        for(int j = 1 ; j<arr.length ; j++)
        {
            if(arr[j]!=arr[i])
            {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in an array");
        for(int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Array after removing duplicates would be "+ removeDuplicates(arr));
        sc.close();

    }
    
}
