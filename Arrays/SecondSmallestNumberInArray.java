package Arrays;
import java.util.*;

public class SecondSmallestNumberInArray {
    public static int secondLargest(int arr[])
    {
        int smallest = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(smallest>arr[i])
            {
                smallest = arr[i];
            }
        }
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(secSmall>arr[i] && arr[i]!=smallest)
            {
                secSmall = arr[i];
            }
        }
        return secSmall;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the Array");
        for(int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Second Smallest Number of the Array is "+secondLargest(arr));
        sc.close();
    }
    
}
