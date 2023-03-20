# Radix Sort

Radix Sort is a non-comparative integer sorting algorithm that sorts data with integer keys by grouping digits that represent the same value. It uses counting sort as a subroutine to sort an array of numbers with the same significant position.

## Algorithm Steps

1. Find the maximum element in the array, which tells the number of digits in the maximum element.
2. Do counting sort on the array based on each digit position, from the least significant digit to the most significant digit.
3. The array is sorted in increasing order.

## Complexity

The time complexity of Radix Sort is O(d*(n+b)) where d is the number of digits in the maximum element, n is the number of elements to be sorted, and b is the base of the number system used to represent the elements.
