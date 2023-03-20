package com.isep;

import RadixSort.RadixSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        RadixSort.radixSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
