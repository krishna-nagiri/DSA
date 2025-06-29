package Arrays;

import java.util.Scanner;
public class oneDimensionalArrays {
    // Finding the smallest in the array.
    public static int[] readArray(Scanner sc,int[] arr){
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr) {
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static int[] bubbleSortAscending(int[] arr){  //bubble sort
    
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            boolean swapped = false;
            for(int j = 0;j< n-i-1;j++){ 
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }   
        return arr;
    }
    public static int[] bubbleSortDescending(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            boolean swapped = false;
            for(int j = 0;j<n-i-1;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                    break;
                }
        }
        return arr;
    }
    public static int[] selectionSortAscending(int[] arr){     // selection sort Ascending order
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int min = arr[i];
            int index = i;
            for(int j = i+1;j<n;j++){
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }
        return arr;
    }
    public static int[] selectionSortDescending(int[] arr){         //Selection sort Descending order
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int max = arr[i];
            int index = i;
            for(int j = i+1;j<n;j++){
                if(max < arr[j]){
                    max = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = max;
            arr[index] = temp;
        }
        return arr;
    }
    public static int[] insertionSortAscending(int[] arr){      // insertion sort Ascending Order
        int n = arr.length;
        for(int i = 1;i < n; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] >key){
                arr[j+1] = arr[j];
                j--; 
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static int[] insertionSortDescending(int[] arr){        // insertion Sort Descending Order
        int n = arr.length;
        for(int i =1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] < key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
