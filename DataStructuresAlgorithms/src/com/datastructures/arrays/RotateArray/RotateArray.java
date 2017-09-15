package com.datastructures.arrays.RotateArray;

import java.util.Arrays;


public class RotateArray
{

    public static void main(String[] args)
    {
        int arr[] =
        { 1, 3, 5, 6, 7, 8, 9 };
        int length = arr.length;
        int rotation = 15;
        int output[] = rotate(arr, length, rotation);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(output));

        System.out.println(Arrays.toString(arr));
        output = rotateMethodTwo(arr, length, rotation);
        System.out.println(Arrays.toString(output));
    }

    /**
     * Method 1: Use extra array to shift the array (Extra Space)
     * 
     * @param arr
     * @param length
     * @param rotation
     * @return
     */
    private static int[] rotate(int[] arr, int length, int rotation)
    {
        // Check if given rotation input and size of the array is same.If yes,return the same array
        if (rotation == arr.length)
        {
            return arr;
        }

        // Check if given rotation is greater than array size,if yes,then dive rotation with array length and rotate the array based on the reminder.
        if (rotation > arr.length)
        {
            rotation = rotation % arr.length;
        }

        int[] temp = new int[arr.length];

        int j = 0;
        for (int i = rotation; i < arr.length; i++)
        {
            temp[j] = arr[i];
            j++;
        }

        for (int i = 0; i < rotation; i++)
        {
            temp[j] = arr[i];
            j++;
        }
        return temp;
    }

    /**
     * Method 2: Use without an extra array to shift the array
     * 
     * @param arr
     * @param length
     * @param rotation
     * @return
     */
    private static int[] rotateMethodTwo(int[] arr, int length, int rotation)
    {
        // Check if given rotation input and size of the array is same.If yes,return the same array
        if (rotation == arr.length)
        {
            return arr;
        }

        // Check if given rotation is greater than array size,if yes,then dive rotation with array length and rotate the array based on the reminder.
        if (rotation > arr.length)
        {
            rotation = rotation % arr.length;
        }

        while (rotation > 0)
        {
            int temp = arr[0];
            int index = 0;
            for (int j = index + 1; j < arr.length; j++)
            {
                arr[index] = arr[j];
                index++;
            }
            arr[arr.length - 1] = temp;
            rotation--;
        }

        return arr;
    }
}
