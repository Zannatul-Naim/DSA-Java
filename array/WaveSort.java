
import java.util.Arrays;

public class WaveSort {

    static void swap(int [] a, int i, int j) {

        int temp = a[i];
        a[i] = a[i+1];
        a[i+1] = temp;
    }

    public static void sortWave(int a[], int size) {
        
        for(int i = 0; i < size-1; i++) {
            swap(a, i, i+1);
        }
    }
    
    public static void main(String[] args) {
        
        int [] a = {10, 2, 3, 4, 9, 7, 6, 8, 5, 1};

        System.out.print("Before wave sort: ");
        for(int i : a) {
            System.out.print(i + " ");
        } System.out.println();

        // At first sort the input array
        Arrays.sort(a);
        sortWave(a, a.length);

        System.out.print("After wave sort: ");
        for(int i : a) {
            System.out.print(i + " ");
        } System.out.println();
    }
}
