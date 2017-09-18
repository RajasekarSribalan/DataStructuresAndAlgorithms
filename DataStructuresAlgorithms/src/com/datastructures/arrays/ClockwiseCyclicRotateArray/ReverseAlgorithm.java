package com.datastructures.arrays.ClockwiseCyclicRotateArray;

import java.util.Arrays;

public class ReverseAlgorithm
{
    public static void main(String[] args)
    {
        int arr[] =
        { 1, 3, 5, 6, 7, 8, 9 };
        int length = arr.length;
        int rotation = 15;

        System.out.println("Method 3 --------->");
        System.out.println(Arrays.toString(arr));
        int[] output = rotateMethodThree(arr, length, rotation);
        System.out.println(Arrays.toString(output));

    }

    /**
     * Method 2: Reverse array
     * 
     * @param arr
     * @param length
     * @param rotation
     * @return
     */
    private static int[] rotateMethodThree(int[] arr, int length, int rotation)
    {

        arr = reverseArray(arr, 0, rotation - 1);
        arr = reverseArray(arr, rotation, length - 1);
        arr = reverseArray(arr, 0, length - 1);
        return arr;
    }

    private static int[] reverseArray(int[] arr, int start, int end)
    {

        int temp = 0;
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

        return arr;

    }

}
