
public class DobuleArray {
    
    public static void main(String[] args) {
        
        /*
         * Direct method:
         *  int [][] arr = {{1, 2, 3}, {4, 5, 6}, {...}, ...}
         */

         /*
          * using for loops
          */

        int a[][] = new int [3][4];

        for(int i = 0; i < 3; i++) {
            
            for(int j = 0; j < 4; j++) {

                a[i][j] = i*j;
            }
          }

          // Printing the 2d array

        for(int i = 0; i < 3; i++) {

            for(int j = 0; j < 4; j++) {

                System.out.print(a[i][j] + " ");
            } System.out.println();
        }
    }
}
