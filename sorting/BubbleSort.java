// package sorting;

public class BubbleSort {
    
    public void sort(int arr[], int size) {

        for(int i = 0; i < size-1; i++) {

            for(int j = 0; j < size-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    
                    // swap values
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
    }

    public void display(int [] a, int n) {

        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        } System.out.println();
    }

    public static void main(String[] args) {
        
        BubbleSort bSort = new BubbleSort();

        int [] a = {5,6,4,2,1,3,9,7,8,0};

        System.out.print("Before sorting: ");
        bSort.display(a, 10);

        bSort.sort(a, 10);

        System.out.print("After sorting: ");
        bSort.display(a, 10);
    }
}
