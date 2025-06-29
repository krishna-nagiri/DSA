package Arrays;

import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int[] arr2 = oneDimensionalArrays.readArray(sc, arr);
        // oneDimensionalArrays.printArray(oneDimensionalArrays.bubbleSortAscending(arr2));
        // oneDimensionalArrays.printArray(oneDimensionalArrays.bubbleSortDescending(arr2));
        // oneDimensionalArrays.printArray(oneDimensionalArrays.selectionSortAscending(arr2));
        // oneDimensionalArrays.printArray(oneDimensionalArrays.selectionSortDescending(arr2));
        oneDimensionalArrays.printArray(oneDimensionalArrays.insertionSortAscending(arr2));
        oneDimensionalArrays.printArray(oneDimensionalArrays.insertionSortDescending(arr2));
        
    }
}
// compile : javac Arrays/Tester.java Arrays/oneDimensionalArrays.java
// run     : java Arrays.Tester
