package Tests;

import org.junit.Test;

import static org.junit.Assert.*;
import RadixSort.RadixSort;

public class RadixSortTest {
    @Test
    public void testSort() {
        int[] arr = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int[] sorted = { 2, 24, 45, 66, 75, 90, 170, 802 };
        RadixSort.radixSort(arr);
        assertArrayEquals(sorted, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, () -> RadixSort.radixSort(arr));
    }

    @Test
    public void testOneElementArray() {
        int[] arr = { 1 };
        int[] sorted = { 1 };
        RadixSort.radixSort(arr);
        assertArrayEquals(sorted, arr);
    }

    @Test
    public void testRepeatedElementsArray() {
        int[] arr = { 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] sorted = { 1, 1, 1, 1, 1, 1, 1, 1 };
        RadixSort.radixSort(arr);
        assertArrayEquals(sorted, arr);
    }

    @Test
    public void testNegativeElementsArray() {
        int[] arr = { -1, -2, -3, -4, -5, -6, -7, -8 };
        assertThrows(IllegalArgumentException.class, () -> RadixSort.radixSort(arr));
    }

    @Test
    public void testDescendingOrderArray() {
        int[] arr = { 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] sorted = { 1, 2, 3, 4, 5, 6, 7, 8 };
        RadixSort.radixSort(arr);
        assertArrayEquals(sorted, arr);
    }

    @Test
    public void testAscendingOrderArray() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] sorted = { 1, 2, 3, 4, 5, 6, 7, 8 };
        RadixSort.radixSort(arr);
        assertArrayEquals(sorted, arr);
    }

}
