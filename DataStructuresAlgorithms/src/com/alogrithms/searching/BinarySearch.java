package com.alogrithms.searching;

import java.util.Arrays;

public class BinarySearch
{

    public static void main(String[] args)
    {
        int[] array = new int[15];
        int data = 1;
        for (int i = 0; i < array.length; i++)
        {
            array[i] = data;
            data++;
        }
        printArray(array);
        int output = binarySearch(array, 5);
        System.out.printf("The data %d is found in the %d th index \n", 5, output);

        output = binarySearch(array, 17);
        System.out.printf("The data %d is found in the %d th index", 17, output);

    }

    private static int binarySearch(int[] array, int searchkey)
    {
        int start = 0;
        int end = array.length - 1;
        int currentIndex = 0;
        while (true)
        {
            currentIndex = (start + end) / 2;

            if (array[currentIndex] == searchkey)
            {
                return currentIndex;
            }
            else if (start > end)
            {
                return array.length;
            }
            else
            {
                if (searchkey < array[currentIndex])
                {
                    end = currentIndex - 1;
                }
                else
                {
                    start = currentIndex + 1;
                }
            }
        }

    }

    private static void printArray(int[] array)
    {
        System.out.println(Arrays.toString(array));

    }
}
