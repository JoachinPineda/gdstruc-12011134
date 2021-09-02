package com.company;

public class Main {

    public static void main(String[] args) {

        int [] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println("Reverse Bubble Sort");
        bubbleSort(numbers);
        printArrayElements(numbers);

        reverseSort(numbers);
        System.out.println("\n\nReverse Selection Sort");
        printArrayElements(numbers);

        modifiedSort(numbers);
        System.out.println("\n\nModified Selection Sort");
        printArrayElements(numbers);
    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex >0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i]<arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    private static void reverseSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[largestIndex])
                {
                    largestIndex = i;
                }
            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] =  arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    private static void modifiedSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1;i++)
        {
            int smallestIndex = 0;

            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }
            int temp = arr[smallestIndex];
            arr[i] =  arr[smallestIndex];
            arr[i] = temp;
        }
    }


    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

}
