package Sorting;
import java.util.*;

public class MergeSort {
    public static void mergeSort(int arr[])
    {
        if(arr.length<2)
        {
            return;
        }
        int mid = arr.length/2;
        int left[] = new int[mid];
        int right[] = new int[arr.length-mid];
        for(int i = 0 ; i<mid ; i++)
        {
            left[i] = arr[i];
        }
        for(int i = mid ; i<arr.length ; i++)
        {
            right[i-mid] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);
    }
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compare elements from left and right and pick the smaller one
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Clean up remaining elements
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements in an Array");
        for(int i = 0 ; i<size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array before applying merge sort is ");
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("THe array after applying merge sort in an array is ");
        mergeSort(arr);
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
    
}
