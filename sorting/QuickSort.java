package sorting;

public class QuickSort {
    private int arr[];
    private int length;

    public void sort(int [] inputArray) {
        if(inputArray == null || inputArray.length == 0) return;
     this.arr = inputArray;
     this.length = inputArray.length;
     quickSort(0, length-1);
    }

    private void quickSort(int low, int high) {
        int i = low;
        int j = high;

        // calculate pivot number,
        // taking pivot as middle index number

        int pivot = arr[(low + high) / 2];

        // divide into two arrays

        while(i <= j) {
            /*
             * In each iteration , we will identify a number form left side which
             * is greater then the pivot valuc, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */

             while(arr[i] < pivot) i++;
             while(arr[j] > pivot) j--;

             if(i <= j) {
                swap(i, j); // move index to next position on both sides
                i++;
                j--;
             }
        }
        // call quickSort() method recursively
        if(low < j) quickSort(low, j);
        if(i < high) quickSort(i, high);

    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        QuickSort quickSortExample = new QuickSort();

        int [] inputArr = {100, 200, 60, 58, 89, 1000, 25, 48, 78, 96, 14, 1, 3, 2, 10};
        System.out.print("Before sorting : ");
        for(int value : inputArr) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        quickSortExample.sort(inputArr);

        System.out.print("After sorting : ");
        for(int value : inputArr) {
            System.out.print(value + " ");
        }
        System.out.println();

    }
}