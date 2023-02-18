package bit_manipulation;

public class PreviousNextPowerOfTwo {

    public static int power_of_two(int n) {

        return (1 << n);
    }

    public static boolean is_power_of_two(int n) {

        int x = n&(n-1);
        if(x == 0) return true;
        else return false;
    }

    public static int bitCount(int n) {
        
        int count = 0;
        
        while( n != 0) {
            count++;
            n >>= 1;
        }

        return count;
    }

    public static void main(String[] args) {
        
        int n = 34;

        int k = bitCount(n);
        k -= 1;

        if(is_power_of_two(n)) {

            System.out.println("Previous power: " + power_of_two(k-1));
            System.out.println("Next power: " + power_of_two(k+1));
        } else {

            System.out.println("Previous power: " + power_of_two(k));
            System.out.println("Next power: " + power_of_two(k+1));
        }
    }
    
}
