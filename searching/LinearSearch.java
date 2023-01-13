package searching;

public class LinearSearch {
    
    public static int linear_search(int [] arr, int key) {

        int size = arr.length;
        for(int i = 0; i < size; i++) {
            if(arr[i] == key) return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        int [] inputArray = {24, 25, 65, 89, 90, 12, 1, 0, 30};
        int searchKey = 0;
        System.out.println("Key " + searchKey + " found at index: " + linear_search(inputArray, searchKey));
    }
}
