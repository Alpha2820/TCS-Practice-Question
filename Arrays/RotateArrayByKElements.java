package Arrays;
import java.util.*;

public class RotateArrayByKElements {
    public static void swap(int arr[] , int start , int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void leftOrder(int arr[],int k)
    {
        int n = arr.length;
        k = k % n;
        if(k==0)
        {
            return;
        }
        swap(arr, 0, k-1);
        swap(arr, k , n-1);
        swap(arr,0,n-1);

    }
    public static void rightOrder(int arr[] , int k)
    {
        int n = arr.length;
        if (n == 0) return;
        k = k % n;

        swap(arr, n - k, n - 1); // Reverse last k
        swap(arr, 0, n - k - 1); // Reverse remaining
        swap(arr, 0, n - 1);     // Reverse whole
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
        System.out.println("Enter K (number of rotations):");
        int k = sc.nextInt();

        // Create a copy for the second demonstration
        int[] leftArr = arr.clone();
        int[] rightArr = arr.clone();

        leftOrder(leftArr, k);
        System.out.println("Left Rotation: " + Arrays.toString(leftArr));

        rightOrder(rightArr, k);
        System.out.println("Right Rotation: " + Arrays.toString(rightArr));
        
        sc.close();

    }
    
}
