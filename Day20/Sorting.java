package Day20;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        for(int a_i=0; a_i<n; a_i++) {
            a[a_i] = in.nextInt();
        }
        
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a[j] > a[j + 1]) {
            int temp = a[j];
            a[j] = a[j+1];
            a[j+1] = temp;
            numberOfSwaps++;
        }
    }
    
    // If no elements were swapped during a traversal, array is sorted
    if (numberOfSwaps == 0) {
        break;
    }
}
    System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
    System.out.println("First Element: "+a[0]);
    System.out.println("Last Element: "+a[n-1]);
    }
}