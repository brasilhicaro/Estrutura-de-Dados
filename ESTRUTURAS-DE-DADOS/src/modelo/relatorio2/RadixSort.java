package modelo.relatorio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {

	static int getMax(long[] sequencia, int n)
    {
        int mx = (int) sequencia[0];
        for (int i = 1; i < n; i++)
            if (sequencia[i] > mx)
                mx = (int) sequencia[i];
        return mx;
    }
 
    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(long[] sequencia, int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
 
        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(int) ((sequencia[i] / exp) % 10)]++;
 
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(int) ((sequencia[i] / exp) % 10)] - 1] = (int) sequencia[i];
            count[(int) ((sequencia[i] / exp) % 10)]--;
        }
 
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current
        // digit
        for (i = 0; i < n; i++)
            sequencia[i] = output[i];
    }
 
    // The main function to that sorts arr[] of
    // size n using Radix Sort
    public static void radixsort(long[] sequencia, int n)
    {
        // Find the maximum number to know number of digits
        int m = getMax(sequencia, n);
 
        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(sequencia, n, exp);
    }
}
