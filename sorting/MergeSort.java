package sorting;

public class MergeSort {
    

    public void sort(int [] array) {  // call the sort method

        /*
         * from the sort method calling the main
         * mergesort method.
         */
        mergesort(array, 0, array.length - 1); 
    }

    private void mergesort(int [] arr, int left, int right) {

        if(left >= right) {
            return;
        }

        /*
         * recursive calling the mergesort function
         * by dividing each part into two parts.
         */

        int middle = (left + right) / 2;
        mergesort(arr, left, middle);  // recursive call
        mergesort(arr, middle + 1, right); // recursive call
        merge(arr, left, middle, right);  // merge the divided part sorted.
    }

    /*
     * merge method for merging the array as sorted
     */

    private void merge(int arr[], int left, int middle, int right) { 
        
        int i = left;
        int j = middle+1;
        int index = left;
        int [] temp = new int [10];

        while( i <= middle && j <= right) {

            if(arr[i] < arr[j]) {
                temp[index++] = arr[i++];
            } else {
                temp[index++] = arr[j++];
            }
        }

        /*
         * If left index is greater than middle then
         * copy all the element from right side. else copy all
         * the element from right.
         */

        if(i > middle) {
            while(j <= right) {
                temp[index++] = arr[j++];
            }
        } else {
            while( i <= middle) {
                temp[index++] = arr[i++];
            } 
        }
        
        int l = left;

        while(l < index) {
            arr[l] = temp[l];
            l++;
        }
    }

    public void display(int a[]) {

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        } System.out.println();
    }

    public static void main(String[] args) {
        
        int [] arr = {4, 3, 2, 6, 7, 8, 9, 1, 5};
        
        MergeSort mergeSort = new MergeSort();

        System.out.print("Before sorting: ");
        mergeSort.display(arr);

        mergeSort.sort(arr);

        System.out.print("After sorting: ");
        mergeSort.display(arr);

    }
}
