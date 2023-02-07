
public class PairFind {
    
    public static void pairSum(int a[], int size, int sum) {

        // traversing through the array 
        // for finding the sum

        for(int i = 0; i < size; i++) {

            for(int j = i+1; j < size; j++) {
                if(a[i]+a[j] == sum) {
                    System.out.println(a[i] + " + " + a[j] + " = " + sum);
                    return;
                }
            }
        }
        System.out.println("Not found!");
    }


    public static void main(String[] args) {
        
        int [] a = {23, 45, 66, 54, 33, 22, 1, 3, 66, 54, 20};
        int sum = 4;
        int size = a.length;

        pairSum(a, size, sum);
    }
}
