import Sort.*;
import Utils.*;


public class Main
{
    public static void main(String[] args)
    {
        Sort s = new Sort(1, 12, 3, 4, 1, 2, 324, 2, 342, 342, 22, 2); // initializing Sort object with double values
        Utils.arrprint(s.getArray()); // retrieving and printing the array
        Utils.arrprint(s.bubbleSort()); // sorting (bubble sort) and printing the array
        Utils.arrprint(s.linearSort()); // sorting (linear sort) and printing the array
        Utils.arrprint(s.mergeSort()); // sorting (merge sort) and printing the array
        s.setArray(1, 3, 5, 23, 4, 234, 1, 1, 3, 1); // changing the values of the array
        Utils.arrprint(s.reverse()); // reversing and printing the array
    }
}