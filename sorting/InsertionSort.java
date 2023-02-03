// package sorting;

public class InsertionSort {
    
    public void sort(int a[], int size) {

        for(int i = 1; i < size; i++) {
            
            int key = a[i];

            int j = i-1;

            while(j >= 0 && a[j] > key) {

                a[j+1] = a[j];
                j -= 1;
            }
            a[j+1] = key;
        }
    }

    public void display(int [] a, int n) {

        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        } System.out.println();
    }


    public static void main(String[] args) {
        
        InsertionSort inSort = new InsertionSort();

        int [] a = {5,6,4,2,1,3,9,7,8,0};

        System.out.print("Before sorting: ");
        inSort.display(a, 10);

        inSort.sort(a, 10);

        System.out.print("After sorting: ");
        inSort.display(a, 10);
    }
}
