package bit_manipulation;

public class AllPossibleSubset {
    
    public static void printAllPossibleSubset(int []a, int n) {

        int no_of_subsets = (int)Math.pow(2, n);

        for(int i = 0; i < no_of_subsets; i++) {
            System.out.print("-> ");
            for(int j = 0; j < n; j++) {
                
                if((i & (1 << j)) != 0) {
                    System.out.print(a[j] + " ");
                }
            } System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int[] a = {1, 2, 3};

        printAllPossibleSubset(a, a.length);
    }
}
