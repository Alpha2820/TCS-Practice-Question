package Arrays;
import java.util.*;

public class MedianOfTheGivenArray {
    public static int findMedian(int arr[])
    {
        int n = arr.length;
        Arrays.sort(arr);
        if(arr.length%2!=0)
        {
            return arr[(arr.length)/2];
        }
        return (arr[(n / 2) - 1] + arr[n / 2]) / 2;
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
        System.out.println("The median of the given array is "+ findMedian(arr));
        sc.close();
    }
    
}
