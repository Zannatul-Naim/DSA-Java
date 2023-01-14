package searching;

public class BinarySearch {
    public static int binarySearch(int [] arr, int key) {

        int low = 0; 
        int high = arr.length-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(key < arr[mid]) high = mid-1;
            else if(key > arr[mid]) low = mid+1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {

        int [] inputArray = {3, 4, 5, 66, 78, 666, 5433, 9999, 10000};
        int key = 10000;
        int index = binarySearch(inputArray, key);
        if(index != -1) {
            System.out.println(key + " found at index " + index);
        } else {
            System.out.println(key + " not found!");
        }
    }
}
