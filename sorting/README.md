## What is Quick Sort Algorithm ? 
<hr>
Quick sort partitions an array and then calls itself recursively twice to sort the two resulting subarrays.

This algorithm is quite efficient for large-sized data sets as its average and worst case complexity are of $O(n^2)$, where n is the number of items.

# ALGORITHM
<hr>

// choose pivot <br>
1. swap a[1, rand(1, n)] <br>
// way partition <br>
2. k = 1
3. for i = 2 to n, if a[i] < a[1], swap a[++k, i] <br>
4. -> invariant: a[1..k-1] < a[k] <= a[k+1..n] <br>
// recursive sorts
5. sort a[1..k-1] <br>
6. sort(k+n, n) <br>


## Full implementation

```java
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

```


## Properties of Quick sort ? 
- Not stable
- O(log(n)) extra space
- $O(n^2)$ time, but typically O(nlog(n)) time
- Not adaptive

## Pefrormance of Quick sort ? 
- Worst-case performance $O(n^2)$ <hr>
- Best-case performance $O(n log n)$ (simple partition) or O(n) (three way partition and equal keys) <hr>
- O(n log n) <hr>