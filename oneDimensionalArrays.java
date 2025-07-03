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
    public static void mergeSortAscending(int[] arr,int start, int end){
        if(start >= end) return;  // Base Case.

        int mid = ((start + end)/2);

        // dividing left array

        mergeSortAscending(arr, start, mid);

        // dividing right array

        mergeSortAscending(arr, mid+1, end);

        merge(arr,start,mid,end);

    }
    public static void merge(int[] arr,int start,int mid,int end){
        // creating sizes.
        int n1 = mid - start +1;
        int n2 = end - mid;

        // initalize temp arrays.
        int[] left = new int[n1];
        int[] right = new int[n2];

        // copying data
        for(int i = 0;i<n1;i++){
            left[i] = arr[start+i];
        }
        for(int i = 0;i<n2;i++){
            right[i] = arr[mid+1+i];
        }

        int i = 0,j = 0, k = start;

        while(i<left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }
        while(i<n1){
            arr[k++] = left[i++];
        }
        while(j<n2){
            arr[k++] = right[j++];
        }

        for(int m = 0;m<arr.length;m++){
            System.out.print(arr[m] +" ");
        }
        System.out.println();

    }
}
