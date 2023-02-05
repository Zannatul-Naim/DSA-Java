
public class Rotation {
    
    public static void rightRotate(int [] a ) {

        int temp = a[a.length - 1];

        for(int i = a.length-1; i >= 1; i--) {
            a[i] = a[i-1];
        }
        a[0] = temp;
        
    }
    public static void leftRotate(int [] a ) {

        int temp = a[0];

        for(int i = 0; i < a.length-1; i++) {
            a[i] = a[i+1];
        }
        a[a.length-1] = temp;
        
    }

    public static void printArray(int a[]) {

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        } System.out.println();
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print("Before right rotate: ");
        printArray(a);

        rightRotate(a);
        System.out.print("After right rotate: ");
        printArray(a);

        System.out.print("Before left rotate: ");
        printArray(a);

        leftRotate(a);
        System.out.print("After left rotate: ");
        printArray(a);
        
    }
}
