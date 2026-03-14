package Sorting;

import java.util.*;

public class QuickSort {
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        sort(arr, 0, arr.length - 1);
    }

    // The recursive function
    private static void sort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    // Partitioning logic
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i + 1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements in an Array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array before applying merge sort is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        quickSort(arr);
        System.out.println("The Array after aplying quick sort is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

}
