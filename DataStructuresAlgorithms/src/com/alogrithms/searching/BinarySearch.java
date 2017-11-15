package com.alogrithms.searching;

import java.util.Arrays;

public class BinarySearch
{

    public static void main(String[] args)
    {
        int[] array =
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };

        printArray(array);
        int searchKey = 7;
        int output = binarySearch(array, searchKey);
        System.out.printf("The data %d is found in the %d th index \n", searchKey, output);

        searchKey = 17;
        output = binarySearch(array, searchKey);
        System.out.printf("The data %d is found in the %d th index \n", searchKey, output);

        // Binary Search Using recursion

        int[] arraytwo =
        { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };

        int start = 0;
        int end = arraytwo.length - 1;
        searchKey = 7;
        printArray(array);
        output = recursiveBinarySearch(arraytwo, searchKey, start, end);
        System.out.printf("The data %d is found in the %d th index \n", searchKey, output);

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

    private static int recursiveBinarySearch(int[] arraytwo, int searchKey, int start, int end)
    {

        int mid = (start + end) / 2;

        if (searchKey == arraytwo[mid])
        {
            return mid;
        }
        else if (start > end)
        {
            return arraytwo.length; // Search Key is not found
        }
        else if (searchKey < arraytwo[mid])
        {
            return recursiveBinarySearch(arraytwo, searchKey, start, mid - 1);
        }
        else if (searchKey > arraytwo[mid])
        {
            return recursiveBinarySearch(arraytwo, searchKey, mid + 1, end);
        }

        return arraytwo.length;

    }

    private static void printArray(int[] array)
    {
        System.out.println(Arrays.toString(array));

    }
}
