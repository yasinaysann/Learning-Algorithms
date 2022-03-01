package Algorithms.SortedAlgorithms;

import java.util.Arrays;

/**
 * <h2>
 *  Selection Sort Algorithm
 *  <li>Time Complexity: O(N^2)</li>
 *
 */
public class SelectionSort {
    public static int[] selectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

    public static void main(String[] args){

        int[] arr = {22,12,23,14,32};
        int[] newArr = selectionSort(arr);
        System.out.println(Arrays.toString(newArr));

    }
}
