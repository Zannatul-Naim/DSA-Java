import java.util.Scanner;

public class SingleArray {


    public static boolean isPrime(int n) {

        int cnt = 0;

        if(n <= 1) return false;

        for(int i = 2; i < n; i++) {
            if(n%i == 0) cnt++;
        }

        return cnt == 0;
    }


    public static void main(String[] args) {
        
        int n;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        n = input.nextInt();

        int a [] = new int[n];

        System.out.println("Enter the elements of the array");
        
        for(int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        System.out.println("All the numbers you entered");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        } System.out.println();

        System.out.println("Odd numbers");
        for(int i = 0; i < n; i++) {

            if(a[i] % 2 == 1) {
                System.out.print(a[i] + " ");
            }
        } System.out.println();

        System.out.println("Even numbers");
        for(int i = 0; i < n; i++) {

            if(a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        } System.out.println();

        System.out.println("Prime numbers");
        for(int i = 0; i < n; i++) {

            if(isPrime(a[i])) {
                System.out.print(a[i] + " ");
            }
        } System.out.println();
    }
}