package Sorting;
import java.util.*;

public class InsertionSort {
    public static void sortedArray(int arr[])
    {
        int n = arr.length;
        for(int i = 1 ; i<n ; i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i<size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Array before sorting the array is");
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The array after getting sorted is ");
        sortedArray(arr);
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
