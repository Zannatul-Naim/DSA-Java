package bit_manipulation;

public class BitCount {

    public static int bitCount(int n) {
        
        int count = 0;
        
        while( n != 0) {
            count++;
            n >>= 1;
        }

        return count;
    }

    public static void main(String[] args) {
        
        int n = 64;
        System.out.println("Number of bits in " + n + " is: " + bitCount(n));
    }
    
}
